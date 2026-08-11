-- Last updated: 8/11/2026, 8:46:18 PM
SELECT name as Customers
from Customers
where id not in (
    select customerId
    from Orders
);