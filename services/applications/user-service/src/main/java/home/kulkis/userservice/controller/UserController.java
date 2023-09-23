package home.kulkis.userservice.controller;

import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.mapper.user.UserMapper;
import home.kulkis.userservice.model.user.UserCreateDto;
import home.kulkis.userservice.model.user.UserOutDtoLite;
import home.kulkis.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @PostMapping
    public UserOutDtoLite createUser(@RequestBody UserCreateDto userCreateDto) {
        User user = userMapper.userCreateDtoToUser(userCreateDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user = userService.createUser(user);

        return userMapper.toLiteDto(user);
    }

    @GetMapping
    public String check1123() {
        User user = userService.getByLogin("login1");
        String password = user.getPassword();
        List<String> asd = new ArrayList<>();
        return String.format("Password in database is %s, and it is equals or not to encoded one? %b",
                password,
                passwordEncoder.matches("password1", password));
    }


}
