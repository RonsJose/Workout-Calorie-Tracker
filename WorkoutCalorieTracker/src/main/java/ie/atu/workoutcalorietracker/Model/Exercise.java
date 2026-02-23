package ie.atu.workoutcalorietracker.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exercise {

    @NotBlank(message ="Exercise name cannot be blank")
    private String name;

    @Positive(message = "Weight must be greater than 0")
    private float weight;

    @Positive(message = "Reps must be greater than 0")
    private int reps;

    @Positive(message = "Sets must be greater than 0")
    private int sets;

}

