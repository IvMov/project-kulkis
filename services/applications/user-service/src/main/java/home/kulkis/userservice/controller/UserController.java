package home.kulkis.userservice.controller;

import home.kulkis.userservice.dto.user.*;
import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.entity.user.UserDetails;
import home.kulkis.userservice.mapper.user.UserDetailsMapper;
import home.kulkis.userservice.mapper.user.UserMapper;
import home.kulkis.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @GetMapping("/{id}")
    public UserOutDto getUser(@PathVariable UUID id) {
        User user = userService.getById(id);

        return userMapper.toDto(user);
    }

}
