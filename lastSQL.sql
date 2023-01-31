Use shopdatabase;
Select*from customer;
Select*from invoice;
Select*from product;

SELECT  (
        SELECT COUNT(*)
        FROM   product
        ) AS No_Of_Items ,
        (SELECT COUNT(*)
        FROM   invoice
        ) AS No_of_Invoices,
        (
        SELECT Sum(total_amount )
        FROM   invoice
        ) AS Total_sales ;
        
        
        SELECT*FROM invoice
        INNER JOIN product
        ON invoice.id=product.item_ID
        WHERE ID=1;
        
        
        CREATE TABLE shop(shop_ID int ,shop_name VARCHAR(20), PRIMARY KEY(shop_ID) );
        select*from shop;

        
        
       
        
        