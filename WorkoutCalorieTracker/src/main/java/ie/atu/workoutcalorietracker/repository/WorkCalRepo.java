package ie.atu.workoutcalorietracker.repository;

import ie.atu.workoutcalorietracker.Model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkCalRepo extends JpaRepository<Workout, Long> {

}
