--1

CREATE TABLE employee(
id SERIAL PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
birthday DATE,
email VARCHAR(100)
)


--2

insert into employee (first_name, birthday, email) values ('Joella', '2017-06-17', 'jbaigrie0@mapquest.com');
insert into employee (first_name, birthday, email) values ('Darcy', '1956-02-18', 'dmaccrie1@gmpg.org');
insert into employee (first_name, birthday, email) values ('Dwight', '1967-09-16', 'dsaturley2@nbcnews.com');
insert into employee (first_name, birthday, email) values ('Payton', '2013-07-25', 'pminchenton3@liveinternet.ru');
insert into employee (first_name, birthday, email) values ('Geralda', '1985-09-30', 'gjablonski4@toplist.cz');
insert into employee (first_name, birthday, email) values ('Ilyssa', '2000-01-01', 'isattin5@chron.com');
insert into employee (first_name, birthday, email) values ('Netti', '1973-01-05', 'nsnead6@nationalgeographic.com');
insert into employee (first_name, birthday, email) values ('Nada', '1919-08-13', 'nmeynell7@hexun.com');
insert into employee (first_name, birthday, email) values ('Shay', '1953-06-11', 'sgwilliam8@latimes.com');
insert into employee (first_name, birthday, email) values ('Bond', '1928-07-19', 'bmallion9@com.com');
insert into employee (first_name, birthday, email) values ('Stanly', '1995-04-16', 'sdodsleya@yahoo.com');
insert into employee (first_name, birthday, email) values ('Paige', '1980-06-18', 'pitzkovicib@smugmug.com');
insert into employee (first_name, birthday, email) values ('Cilka', '1941-07-30', 'cgawenc@apache.org');
insert into employee (first_name, birthday, email) values ('Abeu', '1987-03-12', 'acloneyd@purevolume.com');
insert into employee (first_name, birthday, email) values ('Tristan', '1973-05-15', 'tsallowse@imgur.com');
insert into employee (first_name, birthday, email) values ('Bellanca', '1959-02-06', 'bgabelf@baidu.com');
insert into employee (first_name, birthday, email) values ('Dirk', '1981-08-03', 'dyerborng@mapy.cz');
insert into employee (first_name, birthday, email) values ('Tabbitha', '1994-03-10', 'tfarbraceh@dmoz.org');
insert into employee (first_name, birthday, email) values ('Tamra', '1990-03-14', 'thoylesi@desdev.cn');
insert into employee (first_name, birthday, email) values ('Celina', '1943-11-09', 'cfeedhamj@issuu.com');
insert into employee (first_name, birthday, email) values ('Sigismundo', '1986-09-28', 'sskimk@last.fm');
insert into employee (first_name, birthday, email) values ('Tobye', '1963-10-27', 'tdunsl@xinhuanet.com');
insert into employee (first_name, birthday, email) values ('Harlene', '1938-02-21', 'hosbornem@vk.com');
insert into employee (first_name, birthday, email) values ('Gretta', '1942-09-09', 'grosenn@eventbrite.com');
insert into employee (first_name, birthday, email) values ('Jazmin', '1926-03-26', 'jgouldeno@businessinsider.com');
insert into employee (first_name, birthday, email) values ('Artemas', '2009-01-27', 'aturfsp@twitpic.com');
insert into employee (first_name, birthday, email) values ('Christy', '1928-08-01', 'cdivinaq@nih.gov');
insert into employee (first_name, birthday, email) values ('Sarina', '1964-12-05', 'sralstonr@nasa.gov');
insert into employee (first_name, birthday, email) values ('Jordanna', '1976-12-31', 'jodonoghues@noaa.gov');
insert into employee (first_name, birthday, email) values ('Quintilla', '1998-04-04', 'qtampiont@oaic.gov.au');
insert into employee (first_name, birthday, email) values ('Otha', '2001-04-02', 'ogodwinu@nature.com');
insert into employee (first_name, birthday, email) values ('Harley', '1931-10-25', 'hmccoskerv@creativecommons.org');
insert into employee (first_name, birthday, email) values ('Dave', '1986-11-19', 'dlarchierw@digg.com');
insert into employee (first_name, birthday, email) values ('Imogen', '1977-08-03', 'ikyteleyx@youtube.com');
insert into employee (first_name, birthday, email) values ('Cherish', '1967-01-06', 'cskedgey@nytimes.com');
insert into employee (first_name, birthday, email) values ('Dolley', '1992-02-12', 'dtookeyz@example.com');
insert into employee (first_name, birthday, email) values ('Nita', '1963-10-11', 'nlaxson10@earthlink.net');
insert into employee (first_name, birthday, email) values ('Stephannie', '1940-06-04', 'selmar11@yahoo.com');
insert into employee (first_name, birthday, email) values ('Hyacinth', '1981-09-10', 'htracy12@amazon.de');
insert into employee (first_name, birthday, email) values ('Elmer', '1950-09-23', 'egreenacre13@wufoo.com');
insert into employee (first_name, birthday, email) values ('Tawsha', '1997-04-04', 'taveries14@multiply.com');
insert into employee (first_name, birthday, email) values ('Revkah', '2022-06-20', 'rmapp15@bizjournals.com');
insert into employee (first_name, birthday, email) values ('Cristy', '2007-12-09', 'cveronique16@privacy.gov.au');
insert into employee (first_name, birthday, email) values ('Anya', '1953-09-27', 'amauger17@irs.gov');
insert into employee (first_name, birthday, email) values ('Felic', '2021-06-12', 'ffermer18@google.com.br');
insert into employee (first_name, birthday, email) values ('Yance', '1914-07-13', 'ypyne19@usa.gov');
insert into employee (first_name, birthday, email) values ('Orton', '1952-05-15', 'ochaudret1a@opera.com');
insert into employee (first_name, birthday, email) values ('Merell', '1993-02-11', 'mkluge1b@com.com');
insert into employee (first_name, birthday, email) values ('Constantine', '2012-06-06', 'ckrysztofiak1c@trellian.com');
insert into employee (first_name, birthday, email) values ('Sada', '1936-10-06', 'sgoodlatt1d@hugedomains.com');

3--

UPDATE employee SET first_name = 'Ahmet' WHERE id = 1;
UPDATE employee SET first_name = 'Mehmet' WHERE id = 2;
UPDATE employee SET first_name = 'Veli' WHERE id = 3;
UPDATE employee SET first_name = 'Celil' WHERE id = 4;
UPDATE employee SET first_name = 'Kenan' WHERE id = 5;

4--

DELETE FROM employee WHERE first_name = 'Ahmet';
DELETE FROM employee WHERE first_name = 'Mehmet';
DELETE FROM employee WHERE first_name = 'Veli';
DELETE FROM employee WHERE first_name = 'Celil';
DELETE FROM employee WHERE first_name = 'Kenan';




