rem set PGPASSWORD="password" 

rem for dd.MM.yyyy format
set hh=%time:~0,2%
if "%time:~0,1%"==" " set hh=0%hh:~1,1%   
set DATETIMESTR=%date:~6,4%-%date:~3,2%-%date:~0,2%-%hh:~0,2%-%time:~3,2%-%time:~6,2%

mkdir dump\%DATETIMESTR%

docker exec ormdb pg_dump -U orm_user -d orm_db --inserts> dump\%DATETIMESTR%\backup.sql

cd dump\%DATETIMESTR%

tar -zcvf %DATETIMESTR%_backup.tar.gz backup.sql
REM del backup.sql

cd ..\..