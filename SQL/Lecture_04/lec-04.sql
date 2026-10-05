.SEPARATOR |
  
CREATE TABLE Purchase(
    pid int PRIMARY KEY,
    product text,
    price float,
    quantity int,
    month text
);

.import lec04-data.txt Purchase

UPDATE purchase SET price = null 
WHERE price = 'null';

SELECT COUNT(*) FROM purchase;  ---đếm số hàng trong bảng
SELECT COUNT(quantity) FROM purchase; ---đếm số lượng phần tử trong cột quantity khác 
SELECT SUM(quantity) FROM purchase; ---tổng giá trị các phần tử trong cột purchase
SELECT AVG(price) FROM purchase; ---giá trị trung bình của các phần tử trong cột price
SELECT MAX(quantity) FROM purchase; ---giá trị max trong bảng purchase
SELECT MIN(quantity) FROM purchase; ---giá trị min trong bảng purchase

INSERT INTO Purchase VALUES(12, 'gadget', NULL, NULL, 'april');

SELECT count(*) FROM purchase;
SELECT count(quantity) FROM purchase; 
SELECT sum(quantity) FROM purchase;
SELECT sum(quantity) FROM purchase WHERE quantity is not null;
SELECT count(product) FROM purchase;
SELECT count(distinct product) FROM purchase;

---đếm số lượng của từng loại sản phẩm
SELECT product, COUNT(*)
FROM purchase
GROUP BY product;

---đếm số lượng sản phẩm bán ra trong từng tháng
SELECT month, count(*)
FROM purchase
GROUP BY month;

---tổng thu nhập từ các loại sản phẩm được bán ra
SELECT product, sum(price*quantity)
FROM Purchase
GROUP BY product;

