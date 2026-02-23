package ie.atu.workoutcalorietracker.Services;

import ie.atu.workoutcalorietracker.Model.Workout;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {

    private final List<Workout> workouts = new ArrayList<>();
    private long idCounter = 1;

    public Workout createWorkout(Workout workout) {
        workout.setId(idCounter++);
        workouts.add(workout);
        return workout;
    }

    public List<Workout> getAllWorkouts() {
        return workouts;
    }
}