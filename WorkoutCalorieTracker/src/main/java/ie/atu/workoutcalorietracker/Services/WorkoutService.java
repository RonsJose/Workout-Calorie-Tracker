package ie.atu.workoutcalorietracker.Services;

import ie.atu.workoutcalorietracker.Model.User;
import ie.atu.workoutcalorietracker.Model.Workout;
import ie.atu.workoutcalorietracker.client.LoginClient;
import ie.atu.workoutcalorietracker.repository.WorkCalRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {

    private final WorkCalRepo workCalRepository;
    private final LoginClient loginClient;


    public WorkoutService(WorkCalRepo workCalRepository, LoginClient loginClient) {
        this.workCalRepository = workCalRepository;
        this.loginClient = loginClient;
    }


    public Workout createWorkout(Workout workout, Long id) {
        workout.setLoginID(id);
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

    public List<Workout> getWorkoutsByLoginID(Long loginID) {
        return workCalRepository.findByLoginID(loginID);
    }

    public Long login(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return loginClient.loginUser(user);
    }

}