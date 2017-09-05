drop database if exists pruebaServerlets;
create database pruebaServerlets; 
use pruebaServerlets;

create table usuarios (
email varchar(120) not null primary key default 'email',
password varchar(50) not null default 'password'
);

insert into usuarios values( "fer@gmail.com" , "2010");
select * from usuarios;