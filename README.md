## Cinema-app

It's a small, simple but useful tool that can be used as a standalone app or be a part of a bigger,
more complicated application. Cinema app helps you to order tickets on movie sessions available. 
Application can work as web service for online/offline cinema where end user can see current movie
lineup, choose movie-session and order tickets. it also has potential to work as operational system 
for the cashier inside cinema, small changes needed to fit that task.

### Potential

In short term period different type of functionality can be added, for example: ability to see/choose
seats and their prices on certain movie-session. Discount management system can be added, etc.
Application can be configured both for an individual cinema of for an entire cinema network.
Can be integrated into your existing microservice architecture

### Roles

Out of the box Cinema app provide you with two types of roles. 'User' is for end user, this role allows to
see current lineup, pick up movie-session. 'Admin' role
allows you to manage different types of entities such as user, movie, movie-session etc.



### Detailed information



* "/register" - this is where new users can be registered inside the system. Only unique login 
   required. If login already taken application will give signal that you have to choose different login/email. 

### Technologies Used

* Java 17 - as main language
* Hibernate - as the way set models to db
* MySql - as additional way to pick info from db
* Workbench - as database server
* Spring - as framework to build web infrastructure
* Spring security - was used to implement authorisation and authentication
* Apache Tomcat - as web server of the project
* Maven - as builder of the project
* Git - as version control system