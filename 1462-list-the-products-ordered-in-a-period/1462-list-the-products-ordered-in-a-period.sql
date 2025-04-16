Select p.product_name,sum(o.unit)as unit 
From products p join orders o on p.product_id=o.product_id 
where o.order_date between '2020-02-01' and '2020-02-29'
Group by p.product_id having sum(o.unit)>=100;
