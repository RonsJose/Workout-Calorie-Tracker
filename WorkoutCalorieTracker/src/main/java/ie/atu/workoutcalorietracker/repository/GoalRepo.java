package ie.atu.workoutcalorietracker.repository;

import ie.atu.workoutcalorietracker.Model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepo extends JpaRepository<Goal,Long> {
    List<Goal> findByUserId(Long userId);
}
