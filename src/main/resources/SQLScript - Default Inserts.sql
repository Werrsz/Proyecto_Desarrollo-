-- Usuarios
INSERT INTO usuario (correo, tipo_acceso, nombre, contrasena) VALUES
('ana.gomez@gmail.com', 0, 'Ana Gómez', 'ana123'),
('admin@patitas.org', 1, 'Administrador', 'admin123'),
('mario.rios@hotmail.com', 0, 'Mario Ríos', 'mario456');

-- Mascotas
INSERT INTO mascota (nombre, tipo_animal, descripcion, edad, estado, adoptado_por) VALUES
('Luna', 'Perro', 'Perra mestiza muy cariñosa', 3, 'disponible', 0),
('Milo', 'Gato', 'Gatito juguetón y dormilón', 2, 'adoptado', 1),
('Simba', 'Perro', 'Cachorro rescatado, en recuperación', 1, 'en tratamiento', 0);

-- Adopciones
INSERT INTO adopciones (id_mascota, fecha_adopcion, id_usuario) VALUES
(2, '2025-04-01', 1);

-- Castraciones
INSERT INTO castraciones (id_mascota, clinica, precio, fecha) VALUES
(1, 'Clínica Animal Vida', 30000.00, '2025-03-15'),
(3, 'Clínica San Pet', 35000.00, '2025-04-10');

-- Citas
INSERT INTO citas (tipo_servicio, fecha, estado, id_doctor, id_usuario) VALUES
('Vacunación', '2025-04-25', 'pendiente', 101, 1),
('Consulta general', '2025-04-26', 'confirmada', 102, 3);

-- Necesidades
INSERT INTO necesidades (descripcion, tipo, cantidad, fecha, activa) VALUES
('Croquetas para perros adultos', 'Alimento', 20, '2025-04-15', 1),
('Medicamentos post-operatorios', 'Medicinas', 10, '2025-04-18', 1);

-- Donaciones
INSERT INTO donaciones (id_necesidad, fecha, cantidad, id_usuario) VALUES
(1, '2025-04-20', 5000.00, 2),
(2, '2025-04-21', 7500.00, 3);

-- Voluntariado
INSERT INTO voluntariado (correo, nombre, pais, mensaje) VALUES
('valeria.volun@gmail.com', 'Valeria Ruiz', 'Costa Rica', 'Me gustaría ayudar los fines de semana.'),
('carlos.mendez@outlook.com', 'Carlos Méndez', 'México', 'Tengo experiencia en rescate y cuidados básicos.');

-- Testimonios
INSERT INTO testimonios (descripcion, correo, fecha) VALUES
('Adoptar a Milo fue la mejor decisión, es parte de la familia.', 'ana.gomez@gmail.com', '2025-04-05'),
('Gracias a Patitas Solidarias por darme la oportunidad de ayudar.', 'valeria.volun@gmail.com', '2025-04-10');
