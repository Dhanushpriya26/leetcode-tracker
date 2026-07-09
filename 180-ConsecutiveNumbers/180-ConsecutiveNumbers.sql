-- Last updated: 7/9/2026, 9:19:11 AM
# Write your MySQL query statement below
with cte as (
    select num,
    lead(num,1) over() num1,
    lead(num,2) over() num2
    from logs

)
select distinct num ConsecutiveNums from cte where (num=num1) and (num=num2)