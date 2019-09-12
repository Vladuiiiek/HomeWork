SELECT u.name, COUNT(u.idusers) as tours FROM tours_user tu
JOIN users u ON u.idusers = tu.id_user
GROUP BY u.idusers
HAVING (COUNT(u.idusers)>1);