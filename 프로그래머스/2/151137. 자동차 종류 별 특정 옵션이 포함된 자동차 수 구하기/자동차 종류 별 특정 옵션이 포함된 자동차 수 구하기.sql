-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(OPTIONS) CARS
FROM CAR_RENTAL_COMPANY_CAR 
WHERE 1 = 1
AND OPTIONS LIKE '%시트%'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE