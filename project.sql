create database bh18db;
use bh18db;

create table employees(
id int auto_increment primary key,
name varchar(56) unique not null,
age int check (age>0) default 20,
sex boolean,
birthday date default '2019-02-15',
specialty varchar(56)
);
-- удалени
drop table employees;
-- удалени
truncate table employees;
-- удалени
delete from employees; 
insert into employees (id, name, age, sex, birthday, specialty)
value (5, 'Vasil', 19, true, '2001-01-05', 'Stoler');
insert into employees (id, name, age, sex, birthday, specialty)
value (4, 'Male', 29, true, '1990-11-05', 'Stoler')
,(null, 'Olga', 49, false, '1970-06-25', 'buhgalter');
insert into employees value (null, 'Igor', 5, true, null, null);
insert into employees (name, age, sex) value ('Ivan', 24, '1');

-- чтение
select * from employees;
select id, name, specialty from employees;
select id as 'Noner', name as 'Imya', specialty from employees;
select * from employees where id > 7;
select * from employees where birthday < '2005-01-01' && specialty = 'Stoler';
-- новое имя таблице
select e.id, name, e.birthday from employees e ;

select * from employees;
update employees set sex = false where name = 'Ivan';
delete from employees where age <=0;

