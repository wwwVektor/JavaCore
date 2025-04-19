---- Создание таблицы продуктов
CREATE TABLE IF NOT EXISTS "Schema".product (
    id bigserial NOT NULL,
    description varchar NULL,
    "cost" int8 NULL,
    quantity varchar NULL,
    CONSTRAINT product_pk PRIMARY KEY (id)
);

COMMENT ON TABLE "Schema".product IS 'Таблица товаров интернет-магазина. Содержит информацию о наименовании, стоимости и количестве товаров на складе.';
COMMENT ON COLUMN "Schema".product.id IS 'Уникальный идентификатор товара';
COMMENT ON COLUMN "Schema".product.description IS 'Описание товара';
COMMENT ON COLUMN "Schema".product.cost IS 'Стоимость товара в рублях';
COMMENT ON COLUMN "Schema".product.quantity IS 'Количество товара на складе';

-- Создание таблицы покупателей
CREATE TABLE IF NOT EXISTS "Schema".buyer (
    id bigserial NOT NULL,
    fi varchar NULL,
    CONSTRAINT buyer_pk PRIMARY KEY (id)
);

COMMENT ON TABLE "Schema".buyer IS 'Таблица покупателей интернет-магазина. Содержит ФИО покупателей.';
COMMENT ON COLUMN "Schema".buyer.id IS 'Уникальный идентификатор покупателя';
COMMENT ON COLUMN "Schema".buyer.fi IS 'Фамилия и имя покупателя';

-- Создание таблицы заказов
CREATE TABLE IF NOT EXISTS "Schema"."order" (
    id_prod bigint NOT NULL,
    id_buyer bigint NOT NULL,
    "date" date NULL,
    count int4 NULL
);

COMMENT ON TABLE "Schema"."order" IS 'Таблица заказов интернет-магазина. Содержит информацию о заказанных товарах, покупателях, дате заказа и количестве.';
COMMENT ON COLUMN "Schema"."order".id_prod IS 'Идентификатор товара (внешний ключ)';
COMMENT ON COLUMN "Schema"."order".id_buyer IS 'Идентификатор покупателя (внешний ключ)';
COMMENT ON COLUMN "Schema"."order".date IS 'Дата оформления заказа';
COMMENT ON COLUMN "Schema"."order".count IS 'Количество заказанного товара';


--Создание первичных ключей
ALTER TABLE "Schema"."order" ADD CONSTRAINT order_buyer_fk FOREIGN KEY (id_buyer) REFERENCES "Schema".buyer(id);
ALTER TABLE "Schema"."order" ADD CONSTRAINT order_product_fk FOREIGN KEY (id_prod) REFERENCES "Schema".product(id);

--заполнение таблиц
INSERT INTO "Schema".product (description, "cost", quantity)
VALUES 
    ('Смартфон Samsung Galaxy S21', 79990, '15'),
    ('Ноутбук ASUS VivoBook 15', 54990, '8'),
    ('Наушники Sony WH-1000XM4', 24990, '22'),
    ('Телевизор LG OLED55C1', 89990, '5'),
    ('Фитнес-браслет Xiaomi Mi Band 6', 2990, '34'),
    ('Кофемашина DeLonghi Magnifica S', 44990, '3'),
    ('Игровая консоль PlayStation 5', 49990, '2'),
    ('Фотоаппарат Canon EOS 250D', 42990, '7'),
    ('Электронная книга PocketBook 740', 14990, '12'),
    ('Робот-пылесос iRobot Roomba i7', 69990, '4')
ON CONFLICT DO NOTHING;


INSERT INTO "Schema".buyer (fi)
VALUES 
    ('Иванов Иван Иванович'),
    ('Петров Петр Петрович'),
    ('Сидорова Анна Михайловна'),
    ('Кузнецов Дмитрий Сергеевич'),
    ('Смирнова Елена Владимировна'),
    ('Федоров Алексей Николаевич'),
    ('Николаева Ольга Дмитриевна'),
    ('Волков Максим Андреевич'),
    ('Козлова Татьяна Игоревна'),
    ('Белов Артем Викторович')
ON CONFLICT DO NOTHING;


INSERT INTO "Schema"."order" (id_prod, id_buyer, "date", count)
VALUES 
    (1, 1, '2023-01-15', 1),
    (2, 3, '2023-01-16', 1),
    (3, 2, '2023-01-17', 2),
    (4, 5, '2023-01-18', 1),
    (5, 4, '2023-01-19', 3),
    (6, 7, '2023-01-20', 1),
    (7, 6, '2023-01-21', 1),
    (8, 9, '2023-01-22', 1),
    (9, 8, '2023-01-23', 1),
    (10, 10, '2023-01-24', 1)
ON CONFLICT DO NOTHING;