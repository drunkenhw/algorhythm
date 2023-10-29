-- 코드를 입력하세요
SELECT
    u.user_id as user_id,
    u.nickname as nickname,
    concat(u.city," ",u.street_address1," ",u.street_address2) as 전체주소,
    concat(left(tlno,3), '-', substring(tlno,4,4),'-', right(tlno,4)) as 전화번호
from used_goods_user u
inner join used_goods_board b on b.writer_id = u.user_id
group by u.user_id
having count(u.user_id)>=3
order by user_id desc