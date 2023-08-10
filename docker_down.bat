@echo off
rem docker-compose down -v --remove-orphans
if "%COMPOSE_FILE%"=="" (
    call setenv.bat
)
docker-compose down --remove-orphans %*

 
