SELECT a.*
FROM Cars a
INNER JOIN
(
    SELECT manufacturer, MAX(price) AS max_price
    FROM Cars
    GROUP BY manufacturer
) b
    ON a.manufacturer = b.manufacturer AND a.price = b.max_price;