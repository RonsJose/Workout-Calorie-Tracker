package ie.atu.workoutcalorietracker.Controller;

import ie.atu.workoutcalorietracker.Model.Intake;
import ie.atu.workoutcalorietracker.Services.IntakeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calorieIntake")
public class IntakeController {

    private final IntakeService intakeService;

    public IntakeController(IntakeService intakeService) {
        this.intakeService = intakeService;
    }

    @PostMapping
    public ResponseEntity<Intake> createIntake(@Valid @RequestBody Intake intake){
        Intake saved = intakeService.addIntake(intake);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping
    public ResponseEntity<List<Intake>> getAllIntake(){
        return ResponseEntity.ok(intakeService.getAllItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Intake> getById(@PathVariable Long id) {
        return ResponseEntity.ok(intakeService.getIntakeById(id));
    }
}

