-- Last updated: 7/21/2026, 9:30:44 AM
# Write your MySQL query statement below

SELECT p.product_name AS product_name, sum(o.unit) AS unit FROM Products p
JOIN Orders o USING (product_id)
WHERE YEAR(o.order_date)='2020' AND MONTH(o.order_date)='02'
GROUP BY p.product_id
HAVING SUM(o.unit)>=100