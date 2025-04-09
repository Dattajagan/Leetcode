WITH tab AS ( SELECT  product_id, MAX(change_date) AS Max_date
    FROM Products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
) 
SELECT P.product_id , P.new_price price
FROM Products P JOIN tab T ON P.product_id=T.product_id AND P.change_date=T.Max_date
UNION 
SELECT Product_id, 10 AS price FROM Products WHERE product_id NOT IN (SELECT product_id FROM tab);