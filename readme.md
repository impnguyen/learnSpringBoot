# tutorial
https://www.youtube.com/watch?v=9SGDpanrc8U&t=217s

# plsql docker 
docker run --name student -d -p 5432:5432 -e POSTGRES_PASSWORD=password postgres:alpine
## user: postgres 
## source: https://hub.docker.com/_/postgres
## source: https://towardsdatascience.com/local-development-set-up-of-postgresql-with-docker-c022632f13ea?gi=53de55c9cfd9
## get container id: docker ps
## run bash: docker exec -it 502ddf2548a4 bash
## connect to the database: psql -h localhost -U postgres
## "\l": show databases
## create database: CREATE DATABASE student;
## "\du": show roles
## grant roles permission: GRANT ALL PRIVILEGES ON DATABASE "student" TO postgres;
## connect to student database: \c student
## show relations: \d