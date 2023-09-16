package home.kulkis.userservice.controller;

import home.kulkis.userservice.entity.User;
import home.kulkis.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final UserRepository userRepository;

    @GetMapping("/hello")
    public String checkController() {
        User user = userRepository.findById(UUID.fromString("d0eb55e0-dad3-4a79-8ab8-4e1d6a9678a4")).orElse(new User());
//        User user = new User();
//        user.setId(UUID.randomUUID());
//        user.setAge(12);
//        user.setName("Ivan2");
//        user.setMoney(BigDecimal.valueOf(1900));
//        user.setCreatedDateTime(LocalDateTime.now());
//        user.getPets().add("Fibi2");
//        user = userRepository.save(user);


        return user.toString();

    }
}
