-- higher than 75, ordered by last 3 letters of student name, secondary sort by id asc
select name
from students
where marks > 75
order by substr(name, length(name) - 2, 3), id asc;