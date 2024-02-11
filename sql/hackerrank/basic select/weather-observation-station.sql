-- 8
select distinct city
from station
where substr(city, length(city), 1) in ('A', 'E', 'I', 'O', 'U')
and substr(city, 1, 1) in ('A', 'E', 'I', 'O', 'U');

-- 9
select distinct city
from station
where substr(city, 1, 1) not in ('A', 'E', 'I', 'O', 'U');

-- 10
select distinct city
from station
where substr(city, length(city), 1) not in ('A', 'E', 'I', 'O', 'U');

--11
select distinct city
from station
where substr(city, length(city), 1) not in ('A', 'E', 'I', 'O', 'U')
or substr(city, 1, 1) not in ('A', 'E', 'I', 'O', 'U');

--12
select distinct city
from station
where substr(city, length(city), 1) not in ('A', 'E', 'I', 'O', 'U')
and substr(city, 1, 1) not in ('A', 'E', 'I', 'O', 'U');