package ie.atu.workoutcalorietracker.Exception;

public class GoalNotFoundException extends RuntimeException {
    public GoalNotFoundException(String goalNotFound) {
        super(goalNotFound);
    }
}
