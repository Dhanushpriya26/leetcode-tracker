-- Last updated: 8/11/2026, 8:40:56 PM
# Write your MySQL query statement below
UPDATE salary SET sex =
CASE sex
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;