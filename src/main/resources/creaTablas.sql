/*Se crea la base de datos */
drop schema if exists patitasSolidarias;
drop user if exists usuario_admin;
drop user if exists usuario_reportes;
CREATE SCHEMA patitasSolidarias ;

/*Se crea un usuario para la base de datos llamado "usuario_admin" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_admin'@'%' identified by 'Usuar1o_Clave.';
create user 'usuario_reportes'@'%' identified by 'Usuar1o_Reportes.';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on patitasSolidarias.* to 'usuario_admin'@'%';
grant select on patitasSolidarias.* to 'usuario_reportes'@'%';
flush privileges;

use patitasSolidarias;

/*Se crea la tabla de clientes llamada cliente... igual que la clase Cliente */
CREATE TABLE usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(512) NOT NULL,
  nombre VARCHAR(20) NOT NULL,
  apellidos VARCHAR(30) NOT NULL,
  correo VARCHAR(75) NULL,
  telefono VARCHAR(15) NULL,
  ruta_imagen varchar(1024),
  activo boolean,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
