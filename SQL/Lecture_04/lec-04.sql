.separator |
  
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

---thu nhập trung bình trên mỗi lượt bán sản phẩm theo loại sản phẩm
SELECT product, sum(price*quantity)/count(*)
FROM Purchase
GROUP BY product;



---tháng gần nhất bán sản phẩm theo loại 
WITH ranked_purchase AS (
    SELECT product, 
           month,
           ROW_NUMBER() OVER (
               PARTITION BY product 
               ORDER BY 
                   CASE month
                       WHEN 'January' THEN 1
                       WHEN 'February' THEN 2
                       WHEN 'March' THEN 3
                       WHEN 'April' THEN 4
                       WHEN 'May' THEN 5
                       WHEN 'June' THEN 6
                       WHEN 'July' THEN 7
                       WHEN 'August' THEN 8
                       WHEN 'September' THEN 9
                       WHEN 'October' THEN 10
                       WHEN 'November' THEN 11
                       WHEN 'December' THEN 12
                       ELSE 0
                   END DESC
           ) as rn
    FROM purchase
)
SELECT product, month AS latest_month
FROM ranked_purchase
WHERE rn = 1;



---
CREATE TABLE Product(
   pid int primary key,
   pname text,
   manufacturer text
);

INSERT INTO product values(1, 'bagel', 'Sunshine Co.');
INSERT INTO product values(2, 'banana', 'BusyHands');
INSERT INTO product values(3, 'gizmo', 'GizmoWorks');
INSERT INTO product values(4, 'gadget', 'BusyHands');
INSERT INTO product values(5, 'powerGizmo', 'PowerWorks');

---hiển thị số lượng lượt bán ra theo từng tháng và giá trị trung bình theo từng lượt bán
SELECT month, count(*), sum(price*quantity)/count(*)
FROM Purchase
GROUP BY month
HAVING sum(price*quantity)/count(*)<100;

---số lượt bán ra của mỗi nhà sản xuất
SELECT manufacturer, count(product)
FROM product, purchase
WHERE pname=product
GROUP BY manufacturer;


---thống kê số lượt bán của mỗi nhà sản xuất (kể cả không bán được)
SELECT manufacturer, count(purchase.pid)
FROM product LEFT OUTER JOIN purchase
ON product=pname
GROUP BY manufacturer;



---
