.PRAGMA FOREIGN_KEY = ON
.mode column
.header ON
--EXERCISE 1. Cho CSDL về phim như bên dưới

--- Movies(title, year, length, genre, studioName, producerC#): Bảng Movie chứa thông tin về các bộ phim
--- Starsln(movieTitle, movieYear, starName): Bảng StarsIn cho biết diễn viên đóng phim nào
--- MovieStar(name, address, gender, birthdate): Bảng MovieStar chứa thông tin về diễn viên
--- MovieExec(name, address, cert#, netWorth): Bảng MoviewExec chứa thông tin về đạo diễn
--- Studio(name, address, presC#): Bảng Studio chứa thông tin về hãng phim


-- 1. Bảng Studio (Hãng phim)
CREATE TABLE Studio (
    name VARCHAR(100) PRIMARY KEY,
    address VARCHAR(255),
    [presC#] INT
);

-- 2. Bảng MovieExec (Đạo diễn / Nhà sản xuất)
CREATE TABLE MovieExec (
    name VARCHAR(100),
    address VARCHAR(255),
    [cert#] INT PRIMARY KEY,
    netWorth DECIMAL(15, 2)
);

-- 3. Bảng MovieStar (Diễn viên)
CREATE TABLE MovieStar (
    name VARCHAR(100) PRIMARY KEY,
    address VARCHAR(255),
    gender CHAR(1),
    birthdate DATE
);

-- 4. Bảng Movies (Phim)
CREATE TABLE Movies (
    title VARCHAR(100),
    year INT,
    length INT,
    genre VARCHAR(50),
    studioName VARCHAR(100),
    [producerC#] INT,
    PRIMARY KEY (title, year),
    FOREIGN KEY (studioName) REFERENCES Studio(name),
    FOREIGN KEY ([producerC#]) REFERENCES MovieExec([cert#])
);

-- 5. Bảng StarsIn (Diễn viên đóng phim)
CREATE TABLE StarsIn (
    movieTitle VARCHAR(100),
    movieYear INT,
    starName VARCHAR(100),
    PRIMARY KEY (movieTitle, movieYear, starName),
    FOREIGN KEY (movieTitle, movieYear) REFERENCES Movies(title, year),
    FOREIGN KEY (starName) REFERENCES MovieStar(name)
);

---Import các bảng tương ứng từ file csv
.import Studio.csv Studio;
.import MovieExec.csv MovieExec;
.import MovieStar.csv MovieStar;
.import Movies.csv Movies;
.import StarsIn.csv StarsIn;

--- Viết các câu truy vấn sau:

--- a) Ai là diễn viên nữ chính đã đóng phim Stars War?
--- b) Những diễn viên nào xuất hiện trong các bộ phim sản xuất bởi Paramount năm 1992?
--- c) Ai là chủ tịch của hãng phim MGM?
--- d) Những bộ phim nào dài hơn phim Galaxy Quest?
--- e) Những đạo diễn nào thu nhập cao hơn Mary Tyler Moore?

--- a)
SELECT name FROM MovieStar 
JOIN Starsln ON name=starName 
WHERE movieTitle='Star Wars' 
AND gender='F';

--- b)
SELECT starName FROM Starsln 
JOIN movies ON MovieTitle=Title 
WHERE studioName='Paramount' 
AND year=1992;

---c) 
SELECT m.name FROM MovieExec m 
JOIN studio s ON "presC#"="cert#" 
AND s.name='MGM';

---d)
SELECT title FROM Movies 
WHERE length > (
    SELECT length FROM Movies 
    WHERE title='Galaxy Quest'
);

---e)
SELECT name FROM MovieExec 
WHERE networth > (
    SELECT networth FROM MovieExec 
    WHERE name='Mary Tyler Moore'
);

-------------------------

--EXERCISE 2. Cho CSDL về thiết bị công nghệ như bên dưới. Dữ liệu mẫu trong các file .csv tương ứng.

--- Product(maker,model, type): Bảng Product chứa thông tin về các sản phẩm
--- PC(model, speed, ram, hd, price): Bảng PC chứa thông tin về máy tính PC
--- Laptop(model, speed, ram, hd, screen, price): Bảng Laptop chứa thông tin về máy tính xách tay
--- Printer(model, color, type, price): Bảng Printer chứa thông tin về máy in

-- 1. Bảng Product (Sản phẩm)
CREATE TABLE Product (
    maker VARCHAR(50),
    model VARCHAR(50) PRIMARY KEY,
    type VARCHAR(50)
);

-- 2. Bảng PC (Máy tính để bàn)
CREATE TABLE PC (
    model VARCHAR(50) PRIMARY KEY,
    speed DECIMAL(5,2), -- Hoặc FLOAT tùy hệ CSDL (ví dụ: tốc độ CPU GHz)
    ram INT,            -- Dung lượng RAM (MB hoặc GB)
    hd INT,             -- Dung lượng ổ cứng (GB)
    price DECIMAL(10,2),-- Giá tiền
    FOREIGN KEY (model) REFERENCES Product(model)
);

-- 3. Bảng Laptop (Máy tính xách tay)
CREATE TABLE Laptop (
    model VARCHAR(50) PRIMARY KEY,
    speed DECIMAL(5,2),
    ram INT,
    hd INT,
    screen DECIMAL(4,1), -- Kích thước màn hình (inch, ví dụ: 15.6)
    price DECIMAL(10,2),
    FOREIGN KEY (model) REFERENCES Product(model)
);

-- 4. Bảng Printer (Máy in)
CREATE TABLE Printer (
    model VARCHAR(50) PRIMARY KEY,
    color VARCHAR(10),   -- 'true'/'false' hoặc 'yes'/'no' tùy dữ liệu trong file csv
    type VARCHAR(50),    -- Loại máy in (Laser, Jet, Dot...)
    price DECIMAL(10,2),
    FOREIGN KEY (model) REFERENCES Product(model)
);

--- Viết các câu truy vấn sau:

--- a) Tìm nhà sản xuất và tốc độ của các laptop có ổ cứng ít nhất 30 GB.
--- b) Tìm model và giá của tất cả các sản phẩm (các loại) được làm bởi nhà sản xuất B 
--- c) Tìm những nhà sản xuất có bán Laptop nhưng không bán PC.
--- d) Tìm những kích thước ổ cứng xuất hiện ở 2 hoặc nhiều mẫu PC khác nhau.
--- e) Tìm những cặp mẫu PC có cùng tốc độ và RAM. Mỗi cặp chỉ được liệt kê 1 lần. VD liệt kê cặp (i, j) thì thôi không liệt kê (j, i)
--- f) Tìm những nhà sản xuất có ít nhất 2 mẫu máy tính khác nhau (PC hoặc Laptop)


---a)
SELECT maker,speed FROM product 
JOIN laptop USING(model) `
WHERE hd>=30;

---b)
SELECT x.model,x.price FROM (
    SELECT model,price FROM pc
    UNION 
    SELECT model,price FROM laptop 
    UNION 
    SELECT model,price FROM printer
    ) AS x 
JOIN product USING(model) 
WHERE maker='B';

---c)
SELECt maker FROM product
WHERE type='laptop'
EXCEPT
SELECT maker FROM product
WHERE type='pc';

---d)
SELECT hd FROM pc
group by hd
HAVING COUNT(distinct model)>=2;
//Hoặc
SELECT p1.hd FROM pc p1
JOIN pc p2 ON p1.hd=p2.hd
WHERE p1.model<p2.model;

---e)
SELECT p1.model model_1, p2.model model_2
FROM pc p1 JOIN pc p2 
ON p1.ram=p2.ram
AND p1.speed=p2.speed
WHERE p1.model<p2.model;

---f)
SELECT maker FROM product 
WHERE type IN('pc','laptop') 
GROUP BY maker 
HAVING COUNT(model) >=2;
