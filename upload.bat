set DOCKER_REGISTRY=registry-docker.orm_example
set DOCKER_PROJECT_NAME=orm_exampleo-qa
set IMAGE_NAME=dev_api:latest
set DST_IMAGE_NAME=orm-api
set TAG_VERSION=40-local-build

set LOCAL_IMAGE_NAME=%IMAGE_NAME%
set DST_IMAGE_NAME=%DST_IMAGE_NAME%:%TAG_VERSION%

set REMOTE_IMAGE_NAME=%DOCKER_REGISTRY%/%DOCKER_PROJECT_NAME%/%DST_IMAGE_NAME% 

docker tag %LOCAL_IMAGE_NAME% %REMOTE_IMAGE_NAME%
docker push %REMOTE_IMAGE_NAME%