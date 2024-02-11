-- sum
select sum(population)
from city
where district = 'California';

-- averages
select avg(population)
from city
where district = 'California';

-- average population
select floor(avg(population))
from city;

-- Sum japanese pop
select sum(population)
from city
where countrycode = 'JPN';

-- difference between min and max cities
select max(population) - min(population)
from city;

-- The Blunder
select ceiling(avg(salary) - avg(replace(salary, '0', '')))
from employees;