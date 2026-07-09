-- Last updated: 7/9/2026, 9:15:52 AM
select product_id, year as first_year, quantity, price 
from sales where (product_id, year) in (
    select product_id, min(year)
    from sales
    group by product_id
)