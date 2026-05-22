# Workout Tracker
The workout tacker is a microservice that enables you to track your entire workout in one place. It is part of a bigger service that also tracks your calories. And both of these services are brought together by a login service which saves this under login IDs.

# Features:
* Workout creation - Users can create a workout object that stores a structured workout plan, with multiple exercises.
* Set management - Exercises can include multiple sets, this allows for more detailed tracking of repitions and weight for each set.
* Service integration - Communicates with the login service with OpenFeign.
* User-linked workouts - Workouts are connected to a user account using a login ID, this links each workout to a single user at creation.
* Persistant storage - Data is saved using H2, this allows the serivce to store and retrieve workout data.
* Swagger API - Endpoints are exposed through swagger 
