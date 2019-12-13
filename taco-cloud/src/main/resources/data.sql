delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;

delete from Taco;
delete from Taco_Order;
<<<<<<< HEAD
delete from Ingredient;
insert into taco_Ingredients (id, name, type) values ('FLTO', 'Flour Tortilla', 'WRAP');
insert into taco_Ingredients (id, name, type) values ('COTO', 'Corn Tortilla', 'WRAP');
=======
delete from taco_Ingredient;
insert into taco_Ingredients (id, name, type) values ('FLTO', 'Flour Tortilla', 'WRAP');
insert into taco_Ingredients(id, name, type) values ('COTO', 'Corn Tortilla', 'WRAP');
>>>>>>> 5de92fc611867c941b29bf7a50d0831d4b5e10c7
insert into taco_Ingredients (id, name, type) values ('GRBF', 'Ground Beef', 'PROTEIN');
insert into taco_Ingredients (id, name, type) values ('CARN', 'Carnitas', 'PROTEIN');
insert into taco_Ingredients (id, name, type) values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into taco_Ingredients (id, name, type) values ('LETC', 'Lettuce', 'VEGGIES');
insert into taco_Ingredients (id, name, type) values ('CHED', 'Cheddar', 'CHEESE'); 
insert into taco_Ingredients (id, name, type) values ('JACK', 'Monterrey Jack', 'CHEESE');
insert into taco_Ingredients (id, name, type) values ('SLSA', 'Salsa', 'SAUCE');
insert into taco_Ingredients (id, name, type) values ('SRCR', 'Sour Cream', 'SAUCE');