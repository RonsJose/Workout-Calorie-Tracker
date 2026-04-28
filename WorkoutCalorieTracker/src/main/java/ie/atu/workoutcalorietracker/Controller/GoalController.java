package ie.atu.workoutcalorietracker.Controller;

import ie.atu.workoutcalorietracker.Model.Goal;
import ie.atu.workoutcalorietracker.Services.GoalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {

    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @PostMapping
    public ResponseEntity<Goal> createGoal(@Valid @RequestBody Goal goal) {
        Goal newGoal = goalService.createGoal(goal);
        return ResponseEntity.status(HttpStatus.CREATED).body(newGoal);
    }

    @GetMapping("/userId/{userId}")
    public ResponseEntity<Goal> getByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok((Goal)goalService.getGoalByUserId(userId));
    }

    @GetMapping
    public ResponseEntity<List<Goal>> getAll() {
        return ResponseEntity.ok(goalService.getAllGoals());
    }
}

