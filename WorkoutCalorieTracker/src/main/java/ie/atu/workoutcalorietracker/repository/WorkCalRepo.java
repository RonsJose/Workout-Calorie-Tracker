package ie.atu.workoutcalorietracker.repository;

import ie.atu.workoutcalorietracker.Model.Workout;
import org.hibernate.jdbc.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface WorkCalRepo extends JpaRepository<Workout, Long> {
List<Workout> findByDate(LocalDate date);
List<Workout> findByName(String name);
List<Workout> findByLoginID(Long loginID);
}
