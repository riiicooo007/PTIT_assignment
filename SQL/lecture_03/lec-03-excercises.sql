.PRAGMA FOREIGN_KEY = ON
.mode column
.header ON
--EXERCISE 1. Cho CSDL về phim như bên dưới

--- Movies(title, year, length, genre, studioName, producerC#): Bảng Movie chứa thông tin về các bộ phim
--- Starsln(movieTitle, movieYear, starName): Bảng StarsIn cho biết diễn viên đóng phim nào
--- MovieStar(name, address, gender, birthdate): Bảng MovieStar chứa thông tin về diễn viên
--- MovieExec(name, address, cert#, netWorth): Bảng MoviewExec chứa thông tin về đạo diễn
--- Studio(name, address, presC#): Bảng Studio chứa thông tin về hãng phim

--- Viết các câu truy vấn sau:

--- a) Ai là diễn viên nữ chính đã đóng phim Stars War?
--- b) Những diễn viên nào xuất hiện trong các bộ phim sản xuất bởi Paramount năm 1992?
--- c) Ai là chủ tịch của hãng phim MGM?
--- d) Những bộ phim nào dài hơn phim Galaxy Quest?
--- e) Những đạo diễn nào thu nhập cao hơn Mary Tyler Moore?


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

