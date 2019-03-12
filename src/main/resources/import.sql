INSERT INTO CLIENTES (id,  nombre, direccion, ciudad, telefono) VALUES (1, 'Brayan Restrepo', 'Calle 30 77-12', 'Medellin', '321 436 1170');
INSERT INTO CLIENTES (id,  nombre, direccion, ciudad, telefono) VALUES (2, 'Camilo Restrepo', 'Calle 30 77-12', 'Medellin', '321 436 1170');


INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (1, 1, '1234-9853-9864-4565', 'A', '8233');
INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (2, 1, '2368-9853-8654-5425', 'B', '9633');
INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (3, 2, '8534-7396-7434-1395', 'C', '3233');

INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (1, 1, 'Compras de pc', '2019-03-09', '$1.100.233');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (2, 1, 'Compras D1', '2019-03-10', '$300.000');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (3, 1, 'Compras R', '2019-03-15', '$400.000');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (4, 1, 'Compras Claro', '2019-03-19', '$250.000');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (5, 2, 'Compras TV', '2019-02-05', '$700.000');

INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (6, 2, 'Compras IBM', '2019-02-28', '$850.000');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (7, 3, 'Compras Java', '2019-03-19', '$250.000');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (8, 3, 'Compras Angular', '2019-02-24', '$700.000');
INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (9, 3, 'Compras Payara', '2019-03-15', '$850.000');

INSERT INTO ASESORES VALUES (1, 'Bancos', 'Jhonatan Restrepo');
INSERT INTO ASESORES VALUES (2, 'Creditos', 'Andres Restrepo');
INSERT INTO ASESORES VALUES (3, 'Tarjetas', 'Paola Galeano');
INSERT INTO ASESORES VALUES (4, 'Tarjetas', 'Joge Restrepo');