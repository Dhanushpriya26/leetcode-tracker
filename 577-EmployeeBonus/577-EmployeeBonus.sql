-- Last updated: 7/9/2026, 9:16:57 AM
# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus FROM Employee 
LEFT JOIN Bonus ON Employee.empID = Bonus.empID
WHERE bonus < 1000 OR Bonus IS NULL ;