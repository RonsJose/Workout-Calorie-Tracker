package ie.atu.workoutcalorietracker.Controller;

import ie.atu.workoutcalorietracker.Model.Workout;
import ie.atu.workoutcalorietracker.Services.WorkoutService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @PostMapping("/Create")
    public ResponseEntity<Workout> createWorkout(
            @Valid @RequestBody Workout workout, @RequestParam String username, @RequestParam String password){
        Long id = service.login(username, password);
        Workout newWorkout = service.createWorkout(workout,id);
        return ResponseEntity.status(HttpStatus.CREATED).body(newWorkout);
    }

    @GetMapping("/Show")
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        return ResponseEntity.ok(service.getAllWorkouts());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWorkout(@PathVariable long id){
        service.getWorkoutById(id);
        service.deleteWorkout(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Workout> getWorkoutById(@PathVariable long id){
        return ResponseEntity.ok(service.getWorkoutById(id));
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<Workout>> getWorkoutByDate(@PathVariable LocalDate date){
        return ResponseEntity.ok(service.getWorkoutsByDate(date));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Workout>> getWorkoutByName(@PathVariable String name){
        return ResponseEntity.ok(service.getWorkoutsByName(name));
    }

    @GetMapping("/show/account")
    public ResponseEntity<List<Workout>> getWorkoutByAccount(@RequestParam String username, @RequestParam String password){
    Long id = service.login(username,password);
    return ResponseEntity.ok(service.getWorkoutsByLoginID(id));
    }
}