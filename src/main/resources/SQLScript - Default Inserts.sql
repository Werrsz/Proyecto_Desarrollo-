
USE patitasSolidarias;

-- Inserciones para la tabla: usuario
INSERT INTO usuario (correo, tipo_acceso, nombre, contrasena) VALUES
('ana.perez@email.com', 0, 'Ana Pérez', 'contrasena123'),
('mario.rios@email.com', 1, 'Mario Ríos', 'admin456'),
('lucia.gomez@email.com', 0, 'Lucía Gómez', 'lucia789');

-- Inserciones para la tabla: mascota
INSERT INTO mascota (nombre, tipo_animal, descripcion, edad, estado, adoptado_por) VALUES
('Firulais', 'Perro', 'Perro mestizo muy juguetón', 3, 'disponible', null),
('Mishi', 'Gato', 'Gata rescatada de la calle', 2, 'en tratamiento', null),
('Toby', 'Perro', 'Perrito muy amigable, ideal para niños', 4, 'adoptado', 5);

-- Inserciones para la tabla: adopciones
INSERT INTO adopciones (id_mascota, descripcion_historia, fecha_adopcion, correo_usuario) VALUES
(3, 'Toby fue adoptado por una familia amorosa con niños.', '2024-11-12', 'ana.perez@email.com'),
(2, 'Mishi fue adoptada tras recuperarse de una cirugía.', '2025-01-18', 'lucia.gomez@email.com'),
(1, 'Firulais encontró un hogar con espacio amplio.', '2025-03-05', 'mario.rios@email.com');

-- Inserciones para la tabla: castraciones
INSERT INTO castraciones (id_mascota, clinica, precio, fecha) VALUES
(1, 'Clínica Animal Vida', 15000.00, '2025-02-10'),
(2, 'Huellas Sanas', 13000.00, '2025-03-15'),
(3, 'Veterinaria El Arca', 14000.00, '2025-04-01');

-- Inserciones para la tabla: citas
INSERT INTO citas (tipo_servicio, fecha, estado, correo_usuario, id_mascota) VALUES
('Vacunación', '2025-04-10', 'pendiente', 'ana.perez@email.com', 1),
('Revisión médica', '2025-04-15', 'completada', 'lucia.gomez@email.com', 2),
('Desparasitación', '2025-04-20', 'cancelada', 'mario.rios@email.com', 3);

-- Inserciones para la tabla: necesidades
INSERT INTO necesidades (descripcion, tipo, cantidad, fecha_solicitud) VALUES
('Croquetas para perros adultos', 'Alimento', 5, '2025-04-01'),
('Arena para gatos', 'Higiene', 3, '2025-04-03'),
('Medicamentos antipulgas', 'Salud', 10, '2025-04-05');

-- Inserciones para la tabla: donaciones
INSERT INTO donaciones (fecha, descripcion, tipo, cantidad, correo_donante) VALUES
('2025-03-20', 'Donación en efectivo para tratamientos', 'Monetaria', 25000.00, 'donante1@email.com'),
('2025-03-25', 'Sacos de alimento para perros', 'Especie', 4, 'donante2@email.com'),
('2025-04-01', 'Medicamentos varios', 'Especie', 3, 'donante3@email.com');

-- Inserciones para la tabla: voluntariado
INSERT INTO voluntariado (correo, nombre, pais, mensaje) VALUES
('voluntaria1@email.com', 'Sofía Herrera', 'Costa Rica', 'Quiero ayudar en campañas de adopción'),
('voluntario2@email.com', 'Luis Ramírez', 'Costa Rica', 'Disponible los fines de semana para rescates'),
('voluntaria3@email.com', 'Mariana Solano', 'Panamá', 'Puedo apoyar con diseño gráfico para redes');

-- Inserciones para la tabla: testimonios
INSERT INTO testimonios (descripcion, correo, fecha) VALUES
('Adoptar a Toby fue lo mejor que hicimos como familia.', 'ana.perez@email.com', '2025-03-10'),
('Gracias a Patitas Solidarias, Mishi está sana y feliz.', 'lucia.gomez@email.com', '2025-03-22'),
('Excelente atención, Firulais fue muy bien recibido.', 'mario.rios@email.com', '2025-04-01');
