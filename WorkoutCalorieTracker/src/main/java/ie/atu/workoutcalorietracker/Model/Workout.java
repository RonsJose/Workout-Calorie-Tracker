package ie.atu.workoutcalorietracker.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Workout {
    private long id;

    @NotBlank(message="Workout name is required")
    private String name;

    @NotBlank(message = "Workout date is required")
    private String date;

    @NotEmpty(message="Exercises cannot be empty")
    @Valid
    private List<Exercise> exercises;


}