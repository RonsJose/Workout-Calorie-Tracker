package ie.atu.workoutcalorietracker.Services;

import ie.atu.workoutcalorietracker.Model.Workout;
import ie.atu.workoutcalorietracker.repository.WorkCalRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {

    private List<Workout> workouts;
    private final WorkCalRepo workCalRepository;

    public WorkoutService(WorkCalRepo workCalRepository) {
        this.workCalRepository = workCalRepository;
    }


    public Workout createWorkout(Workout workout) {
        workCalRepository.save(workout);
        return workout;
    }

    public List<Workout> getAllWorkouts() {
        return workCalRepository.findAll();
    }

    public void deleteWorkout(Long id) {
        if (!workCalRepository.existsById(id)) {
            throw new RuntimeException("Workout not found");
        }

        workCalRepository.deleteById(id);
    }

    public Workout getWorkoutById(Long id) {
        return workCalRepository.findById(id).orElseThrow(() ->new RuntimeException("Workout not found"));
    }

    public List<Workout> getWorkoutsByDate(LocalDate date) {
        return workCalRepository.findByDate(date);
    }

    public List<Workout> getWorkoutsByName(String name) {
        return workCalRepository.findByName(name);
    }

}