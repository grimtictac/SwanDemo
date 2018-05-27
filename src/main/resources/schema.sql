create table if not exists tasks
(
   id integer not null,
   description varchar(255) not null,
   primary key(id)
);

create table if not exists users
(
   id integer not null,
   username   varchar(255),
   first_name varchar(255),
   last_name  varchar(255),
   primary key(id)
);