use truyum;

/*Inserting Data Into the tables*/
insert into menu_item(me_id, me_name, me_price, me_active, me_date_of_launch, me_category, me_free_delivery)
values (1, 'Sandwich', 99.00, true, '2017-03-15', 'Main Course', true),
       (2, 'Burger', 129.00, true, '2017-12-23', 'Main Course', false),
       (3, 'Pizza', 149.00, true, '2017-08-21', 'Main Course', false),
       (4, 'French Fries', 57.00, false, '2017-07-02', 'Starters', false),
       (5, 'Chocolate Brownie', 32.00, true, '2017-11-02', 'Dessert', true);

insert into user(us_id, us_name)
values (4260, 'Admin'),
       (4271, 'Customer');

insert into cart(ct_us_id, ct_pr_id, ct_id)
values (4260, 01, 01),
       (4271, 02, 02),
       (4260, 03, 03),
       (4271, 04, 04),
       (4260, 05, 05);

/*Get Menu Items after the the launch date and active status*/
select *
from menu_item
where me_active = true
  and me_date_of_launch > '2017-03-15';

/**/
select *
from menu_item
where me_id in (1, 3, 5);


-- b.update sql menu item table to update all the columns values based on item id.
update menu_item
set me_price         = 97.00,
    me_date_of_launch='2018-11-02'
where me_id = 3;

-- 5.View Cart
-- a.Frame sql query to get all menu items in a particular user's cart
select m.me_name, m.me_free_delivery, m.me_price
from menu_item as m
         inner join cart as c
                    on c.ct_pr_id = m.me_id
         inner join user as u on c.ct_us_id = u.us_id
where u.us_id = 4260;


-- b.frame a sql query to get total price of all menu items in a particular user's cart
select sum(m.me_price) as TotalPrice
from menu_item m
         join cart c on c.ct_pr_id = m.me_id
         join user u on u.us_id = c.ct_us_id
where u.us_id = 4260;

-- 6.Remove Item from cart
-- a.frame sql query to remove a menu items from cart based on user id and menu item id
delete
from cart
where ct_id = 4;
select m.me_name, m.me_free_delivery, m.me_price
from menu_item as m
         inner join cart as c on c.ct_pr_id = m.me_id
         inner join user as u on c.ct_us_id = u.us_id
where u.us_id = 4260;
