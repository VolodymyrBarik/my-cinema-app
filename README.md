## Cinema-app

It's a small, simple but useful tool that can be used as a standalone app or be a part of a bigger,
more complicated application. Cinema app helps you to order tickets on movie sessions available.
Application can work as web service for online/offline cinema where end user can see current movie
lineup, choose movie-session and order tickets. it also has potential to work as operational system
for the cashier inside cinema, small changes needed to fit that task.

### What basic user interface may look like

![basic_user_interface](https://github.com/VolodymyrBarik/my-cinema-app/assets/92677614/687f5539-f667-4a18-b9ee-de6e14b5b92a)

### Potential

In short term different type of functionality can be added, for example: ability to see/choose
seats available and their prices on certain movie-session. Discount management system can be added, etc.
Application can be configured both for an individual cinema of for an entire cinema network.
Can be integrated into existing microservice architecture

### Roles

Out of the box Cinema app provide you with two types of roles. 'User' is for end user, this role allows to
see current lineup, pick up movie-session. 'Admin' role
allows you to manage different types of entities such as user, movie, movie-session etc.
Admin has rights to add movie, cinema-hall, movie-session, see certain user information and delete
movie-session. Functional can be widened to fit needs.

### Detailed controller information

* "cinema/register" - this is where new users can be registered inside the system. Only unique login
   required. If login already taken application will give signal that you have to choose different login/email.
* "cinema/cinema-halls" - as user here you can have all the cinema halls, as admin you have ability to add them
* "cinema/movies" - as user you can have current movies lineup, as admin you have ability to add them
* "cinema/movie-sessions/available" - as user you can see all the movie-sessions available
* "cinema/movie-sessions" - as admin you can add movie-sessions here
* "cinema/orders/complete" - as user you can turn your shopping cart into order
* "cinema/shopping-carts" - as user you can fulfill you shopping cart with movie session chosen here
* "cinema/orders" - as user you can have your orders history here
* "cinema/users" - as administrator you can have all the information about certain user by entering his email

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

### Settings

* resources/db.properties - here you can find MySql and Hibernate properties to establish connection to DB
* config package - here you can find spring web and security settings
* config/DataInitializer - here you can establish initial entities to have access with
* config/SecurityConfig/configure - here you can configure access to different parts of application depending
  on role

