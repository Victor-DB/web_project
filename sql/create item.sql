create table public.item (
	id serial primary key not null,
	number bigserial,
	name varchar(50),
	price int,
	amount varchar(20),
	picture varchar(50),
	edition_date date,
	expiration_date date
);

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 1, '5 этажей', 5000, '1 кг', '../icons/1_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 2, 'Шоколадное чудо', 12000, '3 кг', '../icons/2_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 3, 'Райский фрукт', 6500, '1,2 кг', '../icons/3_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 4, 'Угости подружку', 4500, '1 кг', '../icons/4_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 5, 'Нежный дар', 5000, '1 кг', '../icons/5_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 6, 'Угощение к дню рождения', 5500, '1,2 кг', '../icons/6_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43');

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 7, 'Свадебный каприз', 12800, '3,5 кг', '../icons/6_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

insert into public.item ( number, name, price, amount, picture, edition_date, expiration_date)
				 values ( 8, 'Объедение', 4500, '1 кг', '../icons/7_128px.jpg', '2021-01-03 20:06:43', '2021-01-08 20:06:43' );

