package ie.atu.workoutcalorietracker.Services;

import ie.atu.workoutcalorietracker.Model.Intake;
import ie.atu.workoutcalorietracker.repository.IntakeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntakeService {
    private final IntakeRepo intakeRepo;
    private List<Intake> intake;

    public IntakeService(IntakeRepo intakeRepo) {
        this.intakeRepo = intakeRepo;
    }

    public Intake addIntake(Intake intake){
        intakeRepo.save(intake);
        return intake;
    }

    public Intake getIntakeById(Long id){
        return intakeRepo.findById(id).orElseThrow(() ->new RuntimeException("Workout not found"));
    }

    public List<Intake> getAllItems(){return intakeRepo.findAll();}
}
