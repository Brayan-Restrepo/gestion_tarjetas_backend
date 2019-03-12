INSERT INTO CLIENTES (id,  nombre, direccion, ciudad, telefono) VALUES (1, 'Brayan Restrepo', 'Calle 30 77-12', 'Medellin', '321 436 1170');
INSERT INTO CLIENTES (id,  nombre, direccion, ciudad, telefono) VALUES (2, 'Camilo Restrepo', 'Calle 30 77-12', 'Medellin', '321 436 1170');


INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (1, 1, '1234-9853-9864-4565', 'A', '8233');
INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (2, 1, '2368-9853-8654-5425', 'B', '9633');
INSERT INTO TARJETAS (id, cliente_id, numero, tipo, ccv) VALUES (3, 2, '8534-7396-7434-1395', 'C', '3233');

INSERT INTO CONSUMOS (id, tarjeta_id, descripcion, fecha_consumo, monto) VALUES (1, 1, 'Compras de pc', '2019-03-09', '1233');

INSERT INTO ASESORES VALUES (1, 'Bancos', 'Jhonatan Restrepo');
INSERT INTO ASESORES VALUES (2, 'Creditos', 'Andres Restrepo');
INSERT INTO ASESORES VALUES (3, 'Tarjetas', 'Paola Galeano');
INSERT INTO ASESORES VALUES (4, 'Tarjetas', 'Joge Restrepo');