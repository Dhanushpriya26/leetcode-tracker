-- Last updated: 7/9/2026, 9:15:39 AM
/* Write your T-SQL query statement below */
WITH filter_dates_CTE AS
(
    SELECT 
        *,
        (CASE WHEN change_date <= '2019-08-16' THEN change_date
            ELSE null
            END) AS till_date,
        (CASE WHEN change_date <= '2019-08-16' THEN new_price
            ELSE null
            END)AS till_price
    FROM Products
)
,RANK_CTE AS
(
    SELECT
        *,
        ROW_NUMBER()OVER(PARTITION BY product_id ORDER BY till_date DESC) AS rnk
    FROM filter_dates_CTE
)
SELECT
    product_id,
    COALESCE(till_price,10) AS price
FROM RANK_CTE
WHERE rnk = 1;