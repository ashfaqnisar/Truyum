CREATE DATABASE IF NOT EXISTS truyum;
use truYum;
show tables;
create table if not exists menu_item
(
    item_name      varchar(30) not null,
    price          int,
    active_status  enum ('Yes', 'No'),
    date_of_launch date,
    category       varchar(30),
    free_delivery  enum ('Yes','No'),
    item_id        int primary key
);
create table if not exists users
(
    user_id   int primary key,
    user_name varchar(30)
);

create table if not exists cart
(
    cart_id int primary key,
    user_id int not null,
    item_id int not null,
    foreign key (user_id) references users (user_id),
    foreign key (item_id) references menu_item (item_id)
);
