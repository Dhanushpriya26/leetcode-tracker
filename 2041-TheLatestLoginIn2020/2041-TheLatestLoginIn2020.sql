-- Last updated: 8/11/2026, 8:34:55 PM
# Write your MySQL query statement below
select user_id,
max(time_stamp) as last_stamp
from logins 
where year(time_stamp)=2020
group by user_id;