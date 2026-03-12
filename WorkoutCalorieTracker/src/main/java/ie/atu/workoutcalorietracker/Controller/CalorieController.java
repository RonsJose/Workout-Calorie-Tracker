package ie.atu.workoutcalorietracker.Controller;

import ie.atu.workoutcalorietracker.Model.Goal;
import ie.atu.workoutcalorietracker.Services.CalorieService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calories")
public class CalorieController {

    private final CalorieService calorieService;

    public CalorieController(CalorieService calorieService) {
        this.calorieService = calorieService;
    }

    @PostMapping
    public ResponseEntity<Goal> createGoal(@Valid @RequestBody Goal goal) {
        Goal newGoal = calorieService.createGoal(goal);
        return ResponseEntity.status(HttpStatus.CREATED).body(newGoal);
    }

    @GetMapping
    public ResponseEntity<List<Goal>> getAll() {
        return ResponseEntity.ok(calorieService.getAllGoals());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Goal> getById(@PathVariable Long id) {
        return ResponseEntity.ok(calorieService.getGoalById(id));
    }

}
