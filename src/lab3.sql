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
price int not null,
author_name varchar(45) not null,
author_lastname varchar(45) not null,
author_email varchar(50) not null unique,
author_age int not null,
birthdate date not null,
awards varchar(120)
);

insert into book(name, description, publish_date, category, isbn, pages, price, author_name, author_lastname, author_email, author_age, birthdate, awards)
VALUES
('451 по Фаренгейту', 'Магический реализм его прозы, рукотворные механизмы радости, переносящие человека из настоящего в волшебные миры детства.', '1953-10-19', 'Наукова фантастика', '9780345342966', 256, 253, 'Рей','Бредбері', 'reybredbery@gmail.com', 91,'1920-08-22', ' Медаль Національного Книжкового Фонду за видатний внесок в американську літературу'),
('1984', 'Головний герой, Вінстон Сміт, живе в Лондоні, працює в Міністерстві Правди і є членом Зовнішньої Партії.', '1949-06-08',  'Політична художня', '9780140862539', 328, 215, 'Джордж', 'Орвелл', 'orvelauthor@gmail.com', 46, '1903-06-25', 'Прометей'),
('Майстер і Маргарита', null, '1966-01-01', 'Детектив', '9783630620930', 504, 415, 'Михайло Опанасович', 'Булгаков', 'bulhakov1891@ukr.net', 48, '1891-05-15', null),
('Шантарам', null, '2003-01-01', 'роман', '9780312330521', 1088, 510, 'Ґреґорі Девід', 'Робертс', 'davidroberts5678@outlook.com', 69, '1952-01-01', null),
('Квіти для Елджернона', 'Головний герой — Чарлі Гордон, 37-річний чоловік з розумовою неповносправністю, який працює прибиральником на фабриці з виробництва пластикової тари', '1966-04-01','Роман', '9780606340182', 311, 227, 'Деніел', 'Кіз', 'kiz.daniel1927@yahoo.com', 86, '1927-06-15', 'Премія Гюго та Премія Небюла'),
('Портрет Доріана Грея', null, '1890-07-01', 'Готична художня література', '9780140431872', 320, 310, 'Оскар', 'Уайльд', 'oskar.yaild4225@ukr.net', 46, '1854-10-16', 'Newdigate Prize'),
('Маленький принц', 'Пілот здійснює вимушену посадку в пустелі Сахара і зустрічає одного незвичайного та загадкового хлопчика — принца з іншої планети — астероїда B-612', '1943-04-06', 'Дитяча література', '9783833733215', 96, 95, 'Антуан де', 'Сент-Екзюпері', 'antuan.deEczuperi@outlook.com', 44, '1900-06-29', 'Премія Феміна'),
('Анна Кареніна', 'Основний конфлікт роману розвивається на прикладі кількох сімейних пар: Анна − Каренін, Долі − Облонський, Кіті − Левін', '1876-01-01','соціально-психологічний роман', '9783742420817', 864, 380, 'Лев Миколайович', 'Толстой', 'levtolstoy@yandex.ru', 82, '1828-09-09', 'Орден Святої Анни'),
('Злочин і кара', null, '1866-01-01', 'Психологічний реалізм', '9783863523756', 672, 288, 'Федір Михайлович', 'Достоєвський', 'dostoyevskiy3375@gmail.com', 59, '1821-11-11', 'Audie Award for Literary Fiction & Classics');

select * from book;

update book
	set author_lastname = 'Changed name1'
		where author_email = 'davidroberts5678@outlook.com';

update book
	set author_lastname = 'Changed name2'
		where author_email = 'dostoyevskiy3375@gmail.com';


select count(*) from book where awards is not null;
select * from book where pages = (select min(pages) from book);
select max(pages) from book;
select avg(price) from book;
select sum(price) from book where category = 'Детектив';
select min(price) from book;
select * from book where price = (select min(price) from book);

select * from book where category like '%оман';
select * from book where isbn like '%63%';
select * from book where author_email like '%@gmail.com';

select * from book where price between 50 and 120;
select * from book where price not between 200 and 600;

delete from book where id = 2;
delete from book where name = 'Квіти для Елджернона';
delete from book where isbn = '9783863523756';

ALTER TABLE book RENAME COLUMN name TO book_name;