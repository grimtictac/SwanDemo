create table if not exists tasks
(
   id integer not null,
   description varchar(255) not null,
   primary key(id)
);