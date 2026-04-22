package ie.atu.workoutcalorietracker.DataLoader;

import ie.atu.workoutcalorietracker.Model.Exercise;
import ie.atu.workoutcalorietracker.Model.ExerciseName;
import ie.atu.workoutcalorietracker.Model.ExerciseSet;
import ie.atu.workoutcalorietracker.Model.Workout;
import ie.atu.workoutcalorietracker.repository.WorkCalRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(WorkCalRepo workCalRepo) {
        return args -> {
            if (workCalRepo.count() > 0) {
                return;
            }

            ExerciseSet exerciseSet1 = new ExerciseSet();
            exerciseSet1.setWeight(30);
            exerciseSet1.setReps(12);

            ExerciseSet exerciseSet2 = new ExerciseSet();
            exerciseSet2.setWeight(60);
            exerciseSet2.setReps(10);

            Exercise exercise1 = new Exercise();
            exercise1.setName(ExerciseName.BENCH_PRESS);
            exercise1.setSets(new ArrayList<>(List.of(exerciseSet1, exerciseSet2)));

            Workout workout1 = new Workout();
            workout1.setName("Workout1");
            workout1.setLoginID((long)1);
            workout1.setDate(LocalDate.of(2026,4,22));
            workout1.setExercises(new ArrayList<>(List.of(exercise1)));
            workCalRepo.save(workout1);



            ExerciseSet exerciseSet3 = new ExerciseSet();
            exerciseSet3.setWeight(15);
            exerciseSet3.setReps(12);

            ExerciseSet exerciseSet4 = new ExerciseSet();
            exerciseSet4.setWeight(20);
            exerciseSet4.setReps(10);

            Exercise exercise2 = new Exercise();
            exercise2.setName(ExerciseName.BICEP_CURL);
            exercise2.setSets(new ArrayList<>(List.of(exerciseSet3, exerciseSet4)));

            ExerciseSet exerciseSet5 = new ExerciseSet();
            exerciseSet5.setWeight(60);
            exerciseSet5.setReps(14);

            ExerciseSet exerciseSet6 = new ExerciseSet();
            exerciseSet6.setWeight(75);
            exerciseSet6.setReps(10);

            Exercise exercise3 = new Exercise();
            exercise3.setName(ExerciseName.LAT_PULLDOWN);
            exercise3.setSets(new ArrayList<>(List.of(exerciseSet5, exerciseSet6)));

            Workout workout2 = new Workout();
            workout2.setName("Workout2");
            workout2.setLoginID((long)2);
            workout2.setDate(LocalDate.of(2023,3,21));
            workout2.setExercises(new ArrayList<>(List.of(exercise2,exercise3)));
            workCalRepo.save(workout2);



            ExerciseSet exerciseSet7 = new ExerciseSet();
            exerciseSet7.setWeight(25);
            exerciseSet7.setReps(10);

            Exercise exercise4 = new Exercise();
            exercise4.setName(ExerciseName.SHOULDER_PRESS_DUMBELL);
            exercise4.setSets(new ArrayList<>(List.of(exerciseSet7)));

            Workout workout3 = new Workout();
            workout3.setName("Workout3");
            workout3.setLoginID((long)3);
            workout3.setDate(LocalDate.of(2027,8,15));
            workout3.setExercises(new ArrayList<>(List.of(exercise4)));
            workCalRepo.save(workout3);

            System.out.println("Dummy workout data loaded.");
        };
    }
}
