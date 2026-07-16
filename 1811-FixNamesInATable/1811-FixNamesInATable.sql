-- Last updated: 7/16/2026, 9:13:35 AM
# Write your MySQL query statement below

SELECT 
    user_id
    ,CONCAT(UPPER(SUBSTRING(name,1,1)),LOWER(SUBSTRING(name,2))) AS name
FROM users
ORDER BY user_id