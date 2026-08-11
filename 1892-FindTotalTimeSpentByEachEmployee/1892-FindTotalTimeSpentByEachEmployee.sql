-- Last updated: 8/11/2026, 8:35:18 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select event_day as day ,
emp_id , sum(out_time-in_time) as total_time
from Employees
group by emp_id,event_day;