@echo off
FOR /f "tokens=*" %%i IN ('docker ps -aq') DO docker rm --force %%i
FOR /f "tokens=*" %%i IN ('docker images --format "{{.ID}}"') DO docker rmi --force  %%i
FOR /f "tokens=*" %%i IN ('docker network ls --format "{{.ID}}"') DO docker network rm  %%i