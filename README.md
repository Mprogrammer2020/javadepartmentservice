This is a simple spring boot app using CRUD
to a Department Entity. Api consumer can add
a new deprtment,update existing,delete any
department and get a list of added departments.

Database : Mysql

NOTE: Please replace following before proceeding in application.properties file

yourusername
yourpassword
yourhost
your-db-name

Start the application and access the api at http://localhost:8080/department


Add Department : POST | http://localhost:8080/department

Get One Department : GET | http://localhost:8080/department/{id}

Delete One Department : DELETE | http://localhost:8080/department/{id}

Get All Departments : GET | http://localhost:8080/department


