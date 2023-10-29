
SELECT
    f.category as category,
    f.price as max_price,
    f.product_name as product_name
    from food_product f
    where f.price in (select max(price) from food_product group by category) and
     f.category in ('과자', '국', '김치', '식용유')
    order by max_price desc
    