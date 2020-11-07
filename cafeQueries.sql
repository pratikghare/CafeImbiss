create table cafeteria;

use cafeteria;

insert into menu values
(1, 'Combos', 250.00),
(2, 'Feed the Fam Deals', 600.00),
(3, 'Hamburger', 150.00),
(2, 'Chicken Sandwich & Nuggets', 300.00),
(2, 'Salad', 120.00),
(2, 'Fries & Sides', 150.00),
(3, 'Breakfast Combo', 280.00),
(4, 'Croissant', 250.00),
(5, 'Biscuits', 200.00),
(6, 'Classic', 150.00),
(7, 'Coffee', 140.00),
(8, 'Sides & More', 100.00),
(9, 'Cold Drink', 80.00),
(10, 'Frosty', 210.00),
(11, 'Cookies', 99.99),
(12, 'Kids Meal', 180.00),
(13, 'Value Meal', 150.00),
(14, 'Happy Meal', 250.00);

delete from menu where item_id = 1;