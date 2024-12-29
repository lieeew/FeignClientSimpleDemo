create database `openFeign`;

use `openFeign`;

create table employee
(
    id    int auto_increment
        primary key,
    name  varchar(22) not null,
    email varchar(22) not null,
    age   varchar(22) not null
);
