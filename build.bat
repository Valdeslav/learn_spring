set IMAGE_NAME=orm-api
set TAG_VERSION=25-local-build

docker build . -t %IMAGE_NAME%:%TAG_VERSION% --no-cache
