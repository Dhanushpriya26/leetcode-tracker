-- Last updated: 8/11/2026, 8:46:19 PM
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;