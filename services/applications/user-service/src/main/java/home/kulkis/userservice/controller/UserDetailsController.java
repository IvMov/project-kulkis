package home.kulkis.userservice.controller;

import home.kulkis.userservice.dto.user.UserDetailsOutDto;
import home.kulkis.userservice.dto.user.UserDetailsUpdateDto;
import home.kulkis.userservice.entity.user.UserDetails;
import home.kulkis.userservice.mapper.user.UserDetailsMapper;
import home.kulkis.userservice.mapper.user.UserMapper;
import home.kulkis.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/user-details")
public class UserDetailsController {

    private final UserService userService;
    private final UserDetailsMapper userDetailsMapper;

    @PutMapping
    public UserDetailsOutDto updateUserDetails(@RequestBody UserDetailsUpdateDto userDetailsUpdateDto) {
        UserDetails userDetails = userDetailsMapper.createFromDto(userDetailsUpdateDto);
        userDetails = userService.updateUserDetails(userDetails);

        return userDetailsMapper.toDto(userDetails);
    }


}
