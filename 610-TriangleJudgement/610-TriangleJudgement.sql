-- Last updated: 7/9/2026, 9:16:46 AM
SELECT
    *,
    CASE
        WHEN x + y > z
         AND y + z > x
         AND x + z > y
        Then 'Yes'
        ELSE 'No'
    END as triangle
    FROM Triangle;