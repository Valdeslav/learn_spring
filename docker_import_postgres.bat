rem echo drop database orm_db; | docker exec -i ormdb psql -U orm_user -d orm_db
rem echo create database orm_db; | docker exec -i ormdb psql -U orm_user -d orm_db
rem type dump\backup.sql | docker exec -i ormdb psql -U orm_user -d orm_db

echo SELECT ';DROP MATERIALIZED VIEW ' || string_agg(oid::regclass::text, ', ')  FROM   pg_class WHERE  relkind = 'm'; | psql -h %POSTGRES_HOST% -p %POSTGRES_PORT% -U %POSTGRES_USER% -d %POSTGRES_DB% | psql -h %POSTGRES_HOST% -p %POSTGRES_PORT% -U %POSTGRES_USER% -d %POSTGRES_DB%
echo select ';drop table "' || tablename || '" cascade;' from pg_tables where schemaname='public' | psql -h %POSTGRES_HOST% -p %POSTGRES_PORT% -U %POSTGRES_USER% -d %POSTGRES_DB% | psql -h %POSTGRES_HOST% -p %POSTGRES_PORT% -U %POSTGRES_USER% -d %POSTGRES_DB%
type dump\backup.sql | psql -h %POSTGRES_HOST% -p %POSTGRES_PORT% -U %POSTGRES_USER% -d %POSTGRES_DB%