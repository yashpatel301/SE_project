## Project details
This project has been created as a shopping cart system. This project will help understanding implementation of all the OOPs concept along with design patterns and SOLID principles. 

### To set database 
Host database name: se_project
username: root
password: root

**To create products**
CREATE TABLE products (
    idProducts INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(255) NOT NULL
);

**Inserting queries**
INSERT INTO products (name, price, category) VALUES ('T-Shirt', 19.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Jeans', 49.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Jacket', 79.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Sweater', 39.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Dress', 59.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Shirt', 29.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Skirt', 34.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Shorts', 24.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Blouse', 27.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Hat', 15.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Socks', 5.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Scarf', 12.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Gloves', 9.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Belt', 14.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Coat', 89.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Tie', 19.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Pajamas', 29.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Underwear', 14.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Swimsuit', 34.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Cap', 15.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Blazer', 69.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Tank Top', 19.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Hoodie', 49.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Cardigan', 39.99, 'Clothing');
INSERT INTO products (name, price, category) VALUES ('Leggings', 29.99, 'Clothing');



INSERT INTO products (name, price, category) VALUES ('Smartphone', 699.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Laptop', 999.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Headphones', 199.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Smartwatch', 249.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Tablet', 399.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Camera', 549.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Bluetooth Speaker', 99.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Monitor', 299.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Keyboard', 49.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Mouse', 29.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Charger', 19.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('External Hard Drive', 79.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('USB Flash Drive', 14.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Router', 59.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Printer', 149.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('TV', 499.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('VR Headset', 399.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Smart Home Hub', 129.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Drone', 299.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Fitness Tracker', 99.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('eReader', 129.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Digital Camera', 449.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Bluetooth Headset', 89.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Microphone', 99.99, 'Electronics');
INSERT INTO products (name, price, category) VALUES ('Gaming Console', 299.99, 'Electronics');


INSERT INTO products (name, price, category) VALUES ('Dog Food', 29.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Cat Litter', 19.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Bird Cage', 79.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Fish Tank', 99.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Leash', 14.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Cat Toy', 9.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Hamster Wheel', 24.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Bed', 49.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Pet Shampoo', 12.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Bird Seed', 8.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Collar', 15.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Cat Scratcher', 29.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Aquarium Heater', 19.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Bowl', 9.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Cat Bed', 34.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Fish Food', 4.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Toy', 12.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Bird Perch', 7.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Reptile Terrarium', 79.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Pet Carrier', 39.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Sweater', 24.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Cat Tree', 59.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Dog Treats', 9.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Fish Tank Filter', 19.99, 'PetProducts');
INSERT INTO products (name, price, category) VALUES ('Bird Bath', 14.99, 'PetProducts');

INSERT INTO products (name, price, category) VALUES ('Action Figure', 14.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Dollhouse', 89.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Puzzle', 19.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Board Game', 29.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Toy Car', 9.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Lego Set', 59.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Stuffed Animal', 24.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Yo-Yo', 5.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Building Blocks', 34.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Remote Control Car', 49.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Doll', 19.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Toy Train', 29.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Play-Doh', 9.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Action Set', 44.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Toy Robot', 39.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Marbles', 4.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Model Airplane', 29.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Kite', 12.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Teddy Bear', 19.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Slinky', 7.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Rubik\'s Cube', 9.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Water Gun', 14.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Bouncy Ball', 3.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Toy Helicopter', 49.99, 'Toys');
INSERT INTO products (name, price, category) VALUES ('Play Kitchen', 79.99, 'Toys');


**Creation of credentials table**
CREATE TABLE credentials (
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

**_Note:_** Only database set up is required to run this project, other than that project can be cloned and start by running the MainClass.java. 
