@echo off
if "%COMPOSE_FILE%"=="" (
    call setenv.bat
)
docker-compose ps