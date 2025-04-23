/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  valer
 * Created: 22 abr 2025
 */

/*Se crea la base de datos */
drop schema if exists patitasSolidarias;
drop user if exists usuario_admin;
CREATE SCHEMA patitasSolidarias ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_admin'@'%' identified by 'Usuar1o_Clave.';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on patitasSolidarias.* to 'usuario_admin'@'%';
flush privileges;

DROP DATABASE patitasSolidarias;

-- use patitasSolidarias;
CREATE DATABASE patitasSolidarias;

USE patitasSolidarias;

-- Tabla: Usuarios
CREATE TABLE usuario (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    correo VARCHAR(100),
	tipo_acceso BIT, -- 0 Normal, 1 Admin
	nombre VARCHAR(100),
    contrasena VARCHAR(100)
);

-- Tabla: Lista de Mascotas
CREATE TABLE mascota (
    id_mascota INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    tipo_animal VARCHAR(50),
    descripcion TEXT,
    edad INT,
    estado VARCHAR(50) default 'disponible', -- disponible, adoptado, en tratamiento, etc.
    adoptado_por int
);

-- Tabla: Mascotas adoptadas
CREATE TABLE adopciones (
    id_adopcion INT PRIMARY KEY AUTO_INCREMENT,
    id_mascota INT,
    descripcion_historia TEXT,
    fecha_adopcion DATE,
    correo_usuario VARCHAR(100)
);

-- Tabla: Castraciones
CREATE TABLE castraciones (
    id_castracion INT PRIMARY KEY AUTO_INCREMENT,
    id_mascota INT,
    clinica VARCHAR(100),
    precio DECIMAL(10,2),
    fecha DATE
);

-- Tabla: Mis Citas
CREATE TABLE citas (
    id_cita INT PRIMARY KEY AUTO_INCREMENT,
    tipo_servicio VARCHAR(100),
    fecha DATE,
    estado VARCHAR(50),
    id_doctor INT,
    id_usuario INT
);

-- Tabla: Necesidades
CREATE TABLE necesidades (
    id_necesidad INT PRIMARY KEY AUTO_INCREMENT,
    descripcion TEXT,
    tipo VARCHAR(50),
    cantidad INT,
    fecha_solicitud DATE
);

-- Tabla: Donaciones registradas
CREATE TABLE donaciones (
    id_donacion INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATE,
    descripcion TEXT,
    tipo VARCHAR(50),
    cantidad DECIMAL(10,2),
    correo_donante VARCHAR(100)
);

-- Tabla: Voluntariado
CREATE TABLE voluntariado (
	id_voluntario INT PRIMARY KEY AUTO_INCREMENT,
    correo VARCHAR(100),
    nombre VARCHAR(100),
    pais VARCHAR(100),
    mensaje TEXT
);

-- Tabla: Testimonios
CREATE TABLE testimonios (
    id_testimonios INT PRIMARY KEY AUTO_INCREMENT,
    descripcion TEXT,
    correo VARCHAR(100),
    fecha DATE
);
