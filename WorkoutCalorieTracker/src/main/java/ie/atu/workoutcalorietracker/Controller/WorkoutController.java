package ie.atu.workoutcalorietracker.Controller;

import ie.atu.workoutcalorietracker.Model.Workout;
import ie.atu.workoutcalorietracker.Services.WorkoutService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Workout> createWorkout(
            @Valid @RequestBody Workout workout){

        Workout newWorkout = service.createWorkout(workout);
        return ResponseEntity.status(HttpStatus.CREATED).body(newWorkout);
    }

    @GetMapping
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        return ResponseEntity.ok(service.getAllWorkouts());
    }
}