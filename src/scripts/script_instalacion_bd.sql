drop database if exists octavio;
create database octavio;
use octavio;

create table project(
	id int primary key auto_increment,
    name varchar(100) not null,
    start_date date
);

insert into project (name, start_date) values
	('Portfolio personal',current_date()),
    ('Proyecto Backend Spring Boot',current_date()),
    ('Proyecto Frontend Angular',current_date()),
    ('Proyecto BBDD MySQL',current_date());

select * from project;