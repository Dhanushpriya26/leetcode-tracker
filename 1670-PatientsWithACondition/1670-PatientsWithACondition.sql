-- Last updated: 7/16/2026, 9:13:38 AM
# Write your MySQL query statement below
select * from Patients 
where conditions like ('DIAB1%') 
OR conditions LIKE ('% DIAB1%');