DROP TABLE IF EXISTS catalog;

create table if not exists catalog (
  id varchar(5) not null,
  title varchar(50) not null,
  price decimal(10,2) not null
);

insert into catalog (id, title, price) values ('abcr', 'All Butter Croissant', 0.75);
insert into catalog (id, title, price) values ('ccr', 'Chocolate Croissant', 0.95);
insert into catalog (id, title, price) values ('b', 'Fresh Baguette', 1.60);
insert into catalog (id, title, price) values ('rv', 'Red Velvet', 3.95);
insert into catalog (id, title, price) values ('vs', 'Victoria Sponge', 5.45);
insert into catalog (id, title, price) values ('cc', 'Carrot Cake', 3.45);