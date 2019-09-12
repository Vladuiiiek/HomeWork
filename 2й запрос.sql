SELECT u.name, t.name FROM travel.tours_user tu
JOIN users u ON u.idusers = tu.id_user
JOIN tours t ON t.idTours = tu.tours_id
WHERE u.name = 'Влад';