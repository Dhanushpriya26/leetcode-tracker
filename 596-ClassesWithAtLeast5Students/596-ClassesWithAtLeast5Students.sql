-- Last updated: 7/9/2026, 9:16:51 AM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;