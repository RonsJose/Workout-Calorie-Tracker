package ie.atu.workoutcalorietracker.client;

import ie.atu.workoutcalorietracker.Model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "login-service", url="http://localhost:8081")
public interface LoginClient {
    @PostMapping("/auth/login")
    Long loginUser(@RequestBody User user);
}
