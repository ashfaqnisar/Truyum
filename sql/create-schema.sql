CREATE DATABASE IF NOT EXISTS truyum;
use truYum;
show tables;
create table if not exists menu_item
(
    me_id             bigint (30) primary key,
    me_name           varchar(100),
    me_price          decimal,
    me_active         boolean,
    me_date_of_launch date,
    me_category       varchar(45),
    me_free_delivery  boolean
);

create table if not exists user
(
    us_id   int primary key,
    us_name varchar(30)
);

create table if not exists cart
(
    ct_id    int primary key,
    ct_us_id int not null,
    ct_pr_id bigint not null,
    foreign key (ct_us_id) references user (us_id),
    foreign key (ct_pr_id) references menu_item (me_id)
);
