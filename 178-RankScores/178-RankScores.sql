-- Last updated: 8/11/2026, 8:46:31 PM
SELECT
    S.score,
    COUNT(S2.score) AS `rank`
FROM Scores S,
     (SELECT DISTINCT score FROM Scores) S2
WHERE S.score <= S2.score
GROUP BY S.id
ORDER BY S.score DESC;