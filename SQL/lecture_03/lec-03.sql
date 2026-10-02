CREATE TABLE Company(
   cname VARCHAR(20) PRIMARY KEY,
   country VARCHAR(20));

INSERT INTO Company VALUES ('GizmoWorks', 'USA');
INSERT INTO Company VALUES ('Canon',    'Japan');
INSERT INTO Company VALUES ('Hitachi',  'Japan');

CREATE TABLE Product(
   pname VARCHAR(20) PRIMARY KEY,
   price float,
   category VARCHAR(20),
   manufacturer VARCHAR(20) references Company);

PRAGMA foreign_keys=ON;

INSERT INTO Product VALUES ('Gizmo',      19.99, 'gadget', 'GizmoWorks');
INSERT INTO Product VALUES ('PowerGizmo', 29.99, 'gadget', 'GizmoWorks');
INSERT INTO Product VALUES ('SingleTouch', 149.99, 'photography', 'Canon');
INSERT INTO Product VALUES ('MultiTouch', 199.99, 'photography', 'Hitachi');
INSERT INTO Product VALUES ('SuperGizmo', 49.99, 'gadget', 'Hitachi');


.mode column
.header ON

-- 1. INNER JOINS/SELF-JOINS

---Query 1: Hiển thị tên sản phẩm và giá thành của công ty tại Japan và giá ít hơn 150$
SELECT pname, price
FROM Product, Company
WHERE manufacturer=cname and country='Japan' and price < 150;

---Query 2: Hiển thị tên công ty tại USA và sản xuất loại 'gadget'
SELECT DISTINCT cname
FROM Product, Company
WHERE country = 'USA' AND category = 'gadget'
AND manufacturer = cname;

---Query 3: Hiển thị tên công ty tại Japan vừa sản xuất loại 'gadget' vừa sản xuất loại 'photography'
SELECT DISTINCT cname
FROM Product P1, Product P2, Company
WHERE country = 'Japan' 
AND P1.category = 'gadget'
AND P2.category = 'photography' 
AND P1.manufacturer = cname AND P2.manufacturer = cname;

-- 2. OUTER JOINS

CREATE TABLE Employee(id int, name VARCHAR(10));
CREATE TABLE Sales(employeeID int, productID int);
INSERT INTO Employee VALUES (1,'John');
INSERT INTO Employee VALUES (2,'Jane');
INSERT INTO Employee VALUES (3,'Jack');

INSERT INTO Sales VALUES (1,344);
INSERT INTO Sales VALUES (2,414);
INSERT INTO Sales VALUES (2,544);

---Query 1: Kết hợp 2 bảng khi có id ở bảng Employee trùng employeeID ở bảng ID
SELECT * FROM Employee E, Sales S WHERE E.id = S.employeeID;

---Query 2: Thống kê tất cả các nhân viên và lượt bán ra của từng nhân viên
SELECT * FROM Employee E LEFT OUTER JOIN Sales S ON E.id = S.employeeID;
