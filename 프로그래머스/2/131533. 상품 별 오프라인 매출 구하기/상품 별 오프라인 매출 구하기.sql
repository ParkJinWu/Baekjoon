SELECT P.PRODUCT_CODE, SUM(P.PRICE * OFF.SALES_AMOUNT) AS SALSE
FROM PRODUCT P
JOIN OFFLINE_SALE OFF
ON P.PRODUCT_ID = OFF.PRODUCT_ID
GROUP BY OFF.PRODUCT_ID
ORDER BY 2 DESC,1 ;


