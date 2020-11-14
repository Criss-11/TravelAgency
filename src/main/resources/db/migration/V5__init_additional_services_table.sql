create table additional_services(
id int primary key auto_increment,
description varchar(100) not null,
available bit,
price int
);
alter table trips add column additional_service_id int null ;
alter table trips add foreign key (additional_service_id) references additional_services (id);