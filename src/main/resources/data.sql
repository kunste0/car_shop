INSERT INTO article_types (id) VALUES (0); -- "Motorleistung"
INSERT INTO article_types (id) VALUES (1); -- "Lackierung"
INSERT INTO article_types (id) VALUES (2); -- "Felgen"
INSERT INTO article_types (id) VALUES (3); -- "Sonderausstattungen"

INSERT INTO articles (name, price, type) VALUES ("59 kW", 500, 0);
INSERT INTO articles (name, price, type) VALUES ("70 kW", 500, 0);
INSERT INTO articles (name, price, type) VALUES ("81 kW", 500, 0);

INSERT INTO articles (name, price, type) VALUES ("Rot", 500, 1);
INSERT INTO articles (name, price, type) VALUES ("Blau", 500, 1);

INSERT INTO articles (name, price, type) VALUES ("Stahl", 500, 2);
INSERT INTO articles (name, price, type) VALUES ("Leichtmetall", 500, 2);

INSERT INTO articles (name, price, type) VALUES ("Klimaanlage", 500, 3);
INSERT INTO articles (name, price, type) VALUES ("Geschwindigkeitsbegrenzer", 500, 3);
INSERT INTO articles (name, price, type) VALUES ("Rueckfahrkamera", 500, 3);
INSERT INTO articles (name, price, type) VALUES ("Einparkhilfe", 500, 3);
INSERT INTO articles (name, price, type) VALUES ("Vordersitze beheizbar", 500, 3);
INSERT INTO articles (name, price, type) VALUES ("Nebelscheinwerfer und Abbiegelicht", 500, 3);
INSERT INTO articles (name, price, type) VALUES ("Diebstahlwarnanlage", 500, 3);