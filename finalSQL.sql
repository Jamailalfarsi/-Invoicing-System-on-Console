Use ShopDataBase;

ALTER TABLE  invoice
ADD CONSTRAINT FK_id
FOREIGN KEY (id) REFERENCES customer(customer_ID);

ALTER TABLE  product
ADD CONSTRAINT FK_item_ID 
FOREIGN KEY (item_ID) REFERENCES invoice(id);