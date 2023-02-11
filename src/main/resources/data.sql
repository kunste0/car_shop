INSERT INTO article_types (id) VALUES (0); -- "Motorleistung"
INSERT INTO article_types (id) VALUES (1); -- "Lackierung"
INSERT INTO article_types (id) VALUES (2); -- "Felgen"
INSERT INTO article_types (id) VALUES (3); -- "Sonderausstattungen"

INSERT INTO articles (name, price, type) VALUES ("59 kW", 2000000, 0);
INSERT INTO articles (name, price, type) VALUES ("70 kW", 2400000, 0);
INSERT INTO articles (name, price, type) VALUES ("81 kW", 3000000, 0);

INSERT INTO articles (name, price, type) VALUES ("Rot", 0, 1);
INSERT INTO articles (name, price, type) VALUES ("Blau", 2000, 1);

INSERT INTO articles (name, price, type) VALUES ("Stahl", 0, 2);
INSERT INTO articles (name, price, type) VALUES ("Leichtmetall", 20000, 2);

INSERT INTO articles (name, price, type) VALUES ("Klimaanlage", 10000, 3);
INSERT INTO articles (name, price, type) VALUES ("Geschwindigkeitsbegrenzer", 20000, 3);
INSERT INTO articles (name, price, type) VALUES ("Rueckfahrkamera", 50000, 3);
INSERT INTO articles (name, price, type) VALUES ("Einparkhilfe", 50000, 3);
INSERT INTO articles (name, price, type) VALUES ("Vordersitze beheizbar", 35000, 3);
INSERT INTO articles (name, price, type) VALUES ("Nebelscheinwerfer und Abbiegelicht", 10000, 3);
INSERT INTO articles (name, price, type) VALUES ("Diebstahlwarnanlage", 15000, 3);