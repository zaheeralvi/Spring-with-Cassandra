Spring Boot with Cassandra

Steps:

 1)Create Keyspace using this command
 
 create keyspace cassandracrud with replication ={'class' : 'SimpleStrategy', 'replication_factor' : 1 };
 
 2)Create table using following command
 
 create table User(id int primary key,name text, address text,age int);
