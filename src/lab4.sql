drop database if exists library;
create database library;

use library;

create table book (
id int not null auto_increment primary key,
name varchar(25) not null,
description text,
price decimal not null,
isbn varchar(20),
category_id int not null,
foreign key(category_id) references category(id)
);

create table category(
id int not null auto_increment primary key,
name varchar(25) not null
);

create table author(
id int not null auto_increment primary key,
author_name varchar(25) not null,
author_lastname varchar(45) not null,
author_email varchar(50) not null unique,
address varchar(50),
birthdate date not null,
book_id int not null,
foreign key (book_id) references book(id)
);


