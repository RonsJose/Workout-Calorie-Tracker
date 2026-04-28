package ie.atu.workoutcalorietracker.Services;

import ie.atu.workoutcalorietracker.Model.Goal;
import ie.atu.workoutcalorietracker.repository.GoalRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    private final GoalRepo goalRepo;
    private List<Goal> goalsList;

    public GoalService(GoalRepo goalRepo) { this.goalRepo = goalRepo; }

    public Goal createGoal(Goal goal) {
        goalRepo.save(goal);
        return goal;
    }

    public List<Goal> getGoalByUserId(Long userId) {
        List<Goal> goals = goalRepo.findByUserId(userId);

        if (goals.isEmpty()) {
            throw new RuntimeException("No goals found for userId " + userId);
        }
        else
            return goals;
    }

    public List<Goal> getAllGoals() {
        return goalRepo.findAll();
    }
}

