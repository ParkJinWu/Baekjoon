WITH MAX_SIZE_OF_COLONY AS (
    SELECT MAX(SIZE_OF_COLONY) MAX_SIZE , YEAR(DIFFERENTIATION_DATE) YEAR
    FROM ECOLI_DATA
    GROUP BY YEAR
)

SELECT MS.YEAR, (MS.MAX_SIZE - ED.SIZE_OF_COLONY) YEAR_DEV, ED.ID
FROM MAX_SIZE_OF_COLONY MS ,ECOLI_DATA ED
WHERE YEAR(DIFFERENTIATION_DATE) = MS.YEAR
ORDER BY MS.YEAR , YEAR_DEV
