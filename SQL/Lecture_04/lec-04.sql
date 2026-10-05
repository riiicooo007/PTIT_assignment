.SEPARATOR |
  
CREATE TABLE Purchase(
    pid int PRIMARY KEY,
    product text,
    price float,
    quantity int,
    month text
);

.import lec04-data.txt Purchase

