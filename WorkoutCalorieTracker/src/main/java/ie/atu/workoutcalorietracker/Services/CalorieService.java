package ie.atu.workoutcalorietracker.Services;

import ie.atu.workoutcalorietracker.Exception.GoalNotFoundException;
import ie.atu.workoutcalorietracker.Model.Goal;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalorieService {

    /// Creates and adds goal to list
    private final List<Goal> calorieList = new ArrayList<>();
    private long idCount = 1;

    public Goal createGoal(Goal goal) {

        goal.setId(idCount++);
        calorieList.add(goal);
        return goal;
    }

    /// Gets all the goals in the list
    public List<Goal> getAllGoals() {
        return calorieList;
    }

    /// Shows all goals in the list
    public @Nullable Goal getGoalById(Long id) {
        for (Goal goal : calorieList) {
            if (goal.getId().equals(id)) {
                return goal;
            }
        }
        throw new GoalNotFoundException("Goal not found");
    }

}
