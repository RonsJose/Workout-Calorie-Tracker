package ie.atu.workoutcalorietracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class WorkoutCalorieTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutCalorieTrackerApplication.class, args);
    }
    /// Homepage to view both microservices
}
