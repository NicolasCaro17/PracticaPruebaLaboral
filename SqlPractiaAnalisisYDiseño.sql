use trabajoanalisis;
drop database if exists trabajoanalisis;
create database IF NOT EXISTS trabajoanalisis;
drop user caro;
create user 'caro'@'%' identified by '123';
grant all privileges on trabajoanalisis.* to 'caro'@'%';
use trabajoanalisis;

create table if not exists `panaderia`(
id int(5) not null,
producto varchar(45) not null,
fecha_vencimiento varchar(45) not null,
marca varchar(45) not null,
precio int(5) not null,
cantidad int(5) not null,
primary key(id));
create table if not exists `venta`(
id int(5) not null,
fecha varchar(45) not null,
total int(5) not null,
primary key(id));

select * from panaderia;
select * from venta;
drop table panaderia;
select * from venta ;