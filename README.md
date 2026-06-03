# Workout Tracker
A RESTful microservice built using object-oriented principles to manage user workout data. It allows users to create, view, update, and delete workout records, and is designed to integrate with a larger fitness tracking system.

The service uses an H2 in-memory database for data storage and Swagger UI for API testing and documentation.

<img width="1683" height="1126" alt="image" src="https://github.com/user-attachments/assets/81a68d00-420e-4697-9921-1af91e72c93c" />

# Features:
* Workout creation - Users can create a workout object that stores a structured workout plan, with multiple exercises.
* Set management - Exercises can include multiple sets, this allows for more detailed tracking of repitions and weight for each set.
* Workout deletion - Workouts can be deleted using the ID.
* Service integration - Communicates with the login service with OpenFeign.
* User-linked workouts - Workouts are connected to a user account using a login ID, this links each workout to a single user at creation.
* Persistant storage - Data is saved using H2, this allows the serivce to store and retrieve workout data.
* Swagger API - Endpoints are exposed through swagger

# OOP Concepts Used:
* Encapsulation – User data and fitness information are stored within classes
* Abstraction – Login and data handling are managed through simple methods
* Separation of Concerns – Authentication and tracking features are handled separately

# Tech Stack:
* Java (Spring Boot)
* H2 Database
* Spring Data JPA
* Swagger

# Future Improvements:
* Add authentication (JWT or session-based security)
* Improve analytics (weekly/monthly workout summaries)
* Add workout categories and filtering
* Replace H2 with a persistent database (PostgreSQL/MySQL)
* Add rate limiting or validation improvements
