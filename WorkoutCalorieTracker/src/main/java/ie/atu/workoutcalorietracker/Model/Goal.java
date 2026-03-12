package ie.atu.workoutcalorietracker.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Goal {

    private Long id;

    @NotNull(message = "Goal must not me empty")
    @Min(value = 1, message = "Goal cant be less than 0")
    private Long calorieGoal;

    @NotBlank(message = "Must enter gain or loss")
    private String gainLoss;

    @NotNull(message = "Must enter a date")
    private LocalDate goalDate;
}
