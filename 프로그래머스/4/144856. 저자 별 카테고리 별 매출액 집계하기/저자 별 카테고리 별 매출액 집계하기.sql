
SELECT A.AUTHOR_ID, AUTHOR_NAME, CATEGORY, SUM((SALES * PRICE)) AS TOTAL_SALES
FROM BOOK_SALES S
JOIN BOOK B ON S.BOOK_ID = B.BOOK_ID
JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE s.sales_date like '2022-01%'
GROUP BY CATEGORY, AUTHOR_ID
ORDER BY A.AUTHOR_ID, CATEGORY DESC