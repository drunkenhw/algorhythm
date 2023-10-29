-- 코드를 입력하세요
SELECT
 f.flavor
 from 
 first_half  as f
 inner join (select flavor, sum(total_order) as total_order from july group by flavor ) b
 on f.flavor = b.flavor
 order by (f.total_order+b.total_order) desc
 limit 3