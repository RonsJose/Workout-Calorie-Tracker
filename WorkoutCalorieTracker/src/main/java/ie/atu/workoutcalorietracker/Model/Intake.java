package ie.atu.workoutcalorietracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Intake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Food name must not be empty")
    private String itemName;

    @Max(value = 999, message = "Calorie amount must be less than 1000")
    @Min(value = 0, message = "Calorie amount must not be less than 0")
    @NotNull(message = "Must enter an amount")
    private Long calorieAmount;
}

