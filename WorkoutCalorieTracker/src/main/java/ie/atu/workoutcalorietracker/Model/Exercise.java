package ie.atu.workoutcalorietracker.Model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message ="Exercise name cannot be blank")
    private String name;

    @Positive(message = "Sets must be greater than 0")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "exercise_id")

    private List<ExerciseSet> sets;

}

