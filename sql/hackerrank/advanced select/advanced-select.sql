-- Types of Triangles
SELECT
CASE
    WHEN (A+B <= C OR B+C <= A OR A+C <= B) THEN 'Not A Triangle'
    WHEN (A=B and B=C) THEN 'Equilateral'
    WHEN (A=B OR B=C OR C=A) THEN 'Isosceles'
    ELSE 'Scalene'
END
FROM TRIANGLES;

-- The PADS
Select concat(name, '(', substr(occupation, 1, 1),')')
from occupations
order by name;

Select concat('There are a total of ', count(occupation),' ', lower(occupation), 's.')
from occupations
group by occupation
order by count(occupation) asc, occupation asc;