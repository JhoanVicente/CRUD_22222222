create database persona_crud;
use persona_crud;

create table persona(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	apellido VARCHAR(100),
	dni char(8)
);

insert into persona (nombre, apellido, dni)
values ('Goku', 'Quispe', '77277795'),
('S', 'luis', '77277798'),
('Juan', 'cortes', '99999999');

select * from persona;