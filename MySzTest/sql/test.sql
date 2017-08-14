select * from user ;
select * from partner;
insert into user values(10002,'1','1');
insert into partner(pname) values('xiaoa');
--修改为
alter table user modify aid int auto_increment ; 
alter table user modify aid int default '1';
--
alter table partner modify pid int auto_increment ; 
insert into partner values(last_insert_id(),'xiaoyyy') ;
drop table partner;
drop table user;
truncate table partner
select last_insert_id(); 
select @@IDENTITY;--获取当前增长的id值
create table img(
	id int primary key auto_increment,
	uid int,
	time varchar(40),
	content varchar(200)
);
alter table img AUTO_INCREMENT=1000;-- 必须大小
select * from img;
