drop table if exists trips;
create table trips(
id int primary key auto_increment,
destination varchar(100) not null,
description varchar(100) not null,
available bit,
price int
)