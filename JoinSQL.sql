Use shopdatabase;
Select*from customer;
Select*from invoice;
Select*from product;

SELECT  (
        SELECT COUNT(*)
        FROM   invoice
        ) AS number_of_items,
        (
        SELECT COUNT(*)
        FROM   product
        ) AS item_ID ,
        (
        SELECT Sum(total_amount )
        FROM   invoice
        ) AS total_amount ;
        
        SELECT*FROM invoice
        INNER JOIN product
        ON invoice.id=product.item_ID
        WHERE ID=1;
        
        
        