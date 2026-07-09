-- Last updated: 7/9/2026, 9:15:50 AM
# Write your MySQL query statement below
SELECT p.project_id, ROUND(AVG(e.experience_years),2) AS average_years
FROM Project p 
LEFT JOIN Employee e
ON p.employee_id = e.employee_id
GROUP BY p.project_id