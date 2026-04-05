package ie.atu.workoutcalorietracker.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long loginID;

    @NotBlank(message="Workout name is required")
    private String name;

    private LocalDate date;

    @NotEmpty(message="Exercises cannot be empty")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "workout_id")
    private List<Exercise> exercises;


}