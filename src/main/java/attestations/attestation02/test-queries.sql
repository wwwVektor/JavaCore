-- 1. Получить все товары
select * from "Schema".product

-- 2. Получить всех покупателей (только ФИО)
SELECT fi FROM "Schema".buyer;

-- 3. Получить все заказы с информацией о товаре и покупателе
SELECT o."date", p.description AS product, b.fi AS buyer, o.count, p.cost, 
       (p.cost * o.count) AS total_price
FROM "Schema"."order" o
JOIN "Schema".product p ON o.id_prod = p.id
JOIN "Schema".buyer b ON o.id_buyer = b.id;

-- 4. Получить топ-5 самых дорогих товаров
SELECT description, cost 
FROM "Schema".product
ORDER BY cost DESC
LIMIT 5;

-- 5. Увеличить стоимость всех товаров на 10%
UPDATE "Schema".product
SET cost = cost * 1.1;

-- 6. Изменить фамилию покупателя с id=3
UPDATE "Schema".buyer
SET fi = 'Сидорова-Иванова Анна Михайловна'
WHERE id = 3;

-- 7. Обновить количество товара в заказе
UPDATE "Schema"."order"
SET count = 2
WHERE id_prod = 1 AND id_buyer = 1;


-- 8. Удалить все товары с нулевым количеством
DELETE FROM "Schema".product
WHERE quantity = '0';

-- 9. Удалить покупателя с id=10
DELETE FROM "Schema".buyer
WHERE id = 10;

-- 10. Найти покупателей, которые купили товары дороже 50000 руб
SELECT DISTINCT b.fi AS buyer
FROM "Schema".buyer b
JOIN "Schema"."order" o ON b.id = o.id_buyer
JOIN "Schema".product p ON o.id_prod = p.id
WHERE p.cost > 50000;