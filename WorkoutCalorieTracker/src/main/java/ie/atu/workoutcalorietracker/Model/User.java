package ie.atu.workoutcalorietracker.Model;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    private Long id;

    @NotBlank(message = "You must enter a username")
    private String username;

    @NotBlank(message = "You must enter a password")
    private String password;
}
