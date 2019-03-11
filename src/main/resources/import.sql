INSERT INTO CLIENTES (id,  nombre, direccion, ciudad, telefono) VALUES (1, 'Brayan Restrepo', 'Calle 30 77-12', 'Medellin', '321 436 1170');
INSERT INTO CLIENTES (id,  nombre, direccion, ciudad, telefono) VALUES (2, 'Camilo Restrepo', 'Calle 30 77-12', 'Medellin', '321 436 1170');


INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (1, 1, '1234333312345555', 'A', '1233');
INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (2, 1, '2222333312345555', 'B', '1233');
INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (3, 2, '1234333312345555', 'C', '1233');

INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (1, 1, 'Compras de pc', '2019-03-09', '1233');

INSERT INTO ASESORES VALUES (1, 'Jhonatan Restrepo', 'Bancos');
INSERT INTO ASESORES VALUES (2, 'Andres Restrepo', 'Creditos');
INSERT INTO ASESORES VALUES (3, 'Paola Galeano', 'Calle 31 77-12');
INSERT INTO ASESORES VALUES (4, 'Joge Restrepo', 'Calle 31 77-12');