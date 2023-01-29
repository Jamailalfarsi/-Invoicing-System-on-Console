Use ShopDataBase;

CREATE TABLE invoice(id INTEGER NOT NULL AUTO_INCREMENT, shop_name VARCHAR(30), customer_full_name VARCHAR(50),phone_number VARCHAR(20),invoice_date VARCHAR(50),number_of_items int,total_amount int,
paid_amount VARCHAR(20),balance VARCHAR(20),item_ID int ,PRIMARY KEY(id));

CREATE TABLE product(item_ID int ,item_name VARCHAR(20), unit_price VARCHAR(15), quantity VARCHAR(15),qty_amount_price VARCHAR(20),PRIMARY KEY(item_ID) );

ALTER TABLE  product
ADD CONSTRAINT FK_item_ID 
FOREIGN KEY (item_ID) REFERENCES invoice(id);

select*from invoice;
select*from product;



