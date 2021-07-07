drop database if exists library;
create database library;

use library;

create table book(
id int not null primary key auto_increment,
name varchar(120) not null,
description TEXT,
publish_date date not null default '2018-01-01',
category varchar(30) not null,
isbn varchar(20) not null unique,
pages int not null,
author_name varchar(45) not null,
author_lastname varchar(45) not null,
author_email varchar(50) not null unique,
author_age int not null,
birthdate date not null,
awards varchar(120)
);

insert into book(name, description, publish_date, category, isbn, pages, author_name, author_lastname, author_email, author_age, birthdate, awards)
VALUES
('451 по Фаренгейту', 'Магический реализм его прозы, рукотворные механизмы радости, переносящие человека из настоящего в волшебные миры детства.', '1953-10-19', 'Наукова фантастика', '9780345342966', 256, 'Рей','Бредбері', 'reybredbery@gmail.com', 91,'1920-08-22', ' Медаль Національного Книжкового Фонду за видатний внесок в американську літературу'),
('1984', 'Головний герой, Вінстон Сміт, живе в Лондоні, працює в Міністерстві Правди і є членом Зовнішньої Партії.', '1949-06-08',  'Політична художня', '9780140862539', 328,'Джордж', 'Орвелл', 'orvelauthor@gmail.com', 46, '1903-06-25', 'Прометей'),
('Майстер і Маргарита', null, '1966-01-01', 'Детектив', '9783630620930', 504,'Михайло Опанасович', 'Булгаков', 'bulhakov1891@ukr.net', 48, '1891-05-15', null),
('Шантарам', null, '2003-01-01', 'роман', '9780312330521', 1088,'Ґреґорі Девід', 'Робертс', 'davidroberts5678@outlook.com', 69, '1952-01-01', null),
('Квіти для Елджернона', 'Головний герой — Чарлі Гордон, 37-річний чоловік з розумовою неповносправністю, який працює прибиральником на фабриці з виробництва пластикової тари', '1966-04-01','Роман', '9780606340182', 311,'Деніел', 'Кіз', 'kiz.daniel1927@yahoo.com', 86, '1927-06-15', 'Премія Гюго та Премія Небюла'),
('Портрет Доріана Грея', null, '1890-07-01', 'Готична художня література', '9780140431872', 320,'Оскар', 'Уайльд', 'oskar.yaild4225@ukr.net', 46, '1854-10-16', 'Newdigate Prize'),
('Маленький принц', 'Пілот здійснює вимушену посадку в пустелі Сахара і зустрічає одного незвичайного та загадкового хлопчика — принца з іншої планети — астероїда B-612', '1943-04-06', 'Дитяча література', '9783833733215', 96, 'Антуан де', 'Сент-Екзюпері', 'antuan.deEczuperi@outlook.com', 44, '1900-06-29', 'Премія Феміна'),
('Анна Кареніна', 'Основний конфлікт роману розвивається на прикладі кількох сімейних пар: Анна − Каренін, Долі − Облонський, Кіті − Левін', '1876-01-01','соціально-психологічний роман', '9783742420817', 864, 'Лев Миколайович', 'Толстой', 'levtolstoy@yandex.ru', 82, '1828-09-09', 'Орден Святої Анни'),
('Злочин і кара', null, '1866-01-01', 'Психологічний реалізм', '9783863523756', 672,'Федір Михайлович', 'Достоєвський', 'dostoyevskiy3375@gmail.com', 59, '1821-11-11', 'Audie Award for Literary Fiction & Classics');


select * from book;
select * from book where id = 5 or id = 10 or id = 13;
select * from book where pages > 150;
select * from book where author_age > 30;
select * from book where awards is null;
select * from book where author_email = 'davidroberts5678@outlook.com';
select * from book where isbn = '9783863523756';
select * from book where category ='роман';
select * from book where pages > 200 and author_age > 25;
select * from book where category = 'Психологічний реалізм' or category = 'Наукова фантастика';
select * from book order by name;
select * from book order by author_email;
select * from book order by pages desc;
select distinct * from book;
select distinct author_name from book;
select * from book where publish_date >= '2000-01-01';
select * from book where publish_date <= '2000-01-01';

