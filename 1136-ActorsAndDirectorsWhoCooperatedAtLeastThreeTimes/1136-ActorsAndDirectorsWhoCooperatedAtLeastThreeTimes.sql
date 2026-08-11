-- Last updated: 8/11/2026, 8:38:04 PM
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(timestamp) >= 3;