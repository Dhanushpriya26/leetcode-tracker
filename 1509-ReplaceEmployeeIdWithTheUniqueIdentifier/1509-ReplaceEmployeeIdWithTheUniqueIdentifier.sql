-- Last updated: 7/9/2026, 9:15:24 AM
SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;