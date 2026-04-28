package ie.atu.workoutcalorietracker.repository;

import ie.atu.workoutcalorietracker.Model.Intake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntakeRepo extends JpaRepository<Intake, Long> {
}

