package home.kulkis.userservice.controller;

import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.mapper.user.UserMapper;
import home.kulkis.userservice.model.user.UserCreateDto;
import home.kulkis.userservice.model.user.UserOutDtoLite;
import home.kulkis.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    public UserOutDtoLite createUser(@RequestBody UserCreateDto userCreateDto) {
        User user = userMapper.userCreateDtoToUser(userCreateDto);
        user = userService.createUser(user);

        return userMapper.toLiteDto(user);
    }


}
