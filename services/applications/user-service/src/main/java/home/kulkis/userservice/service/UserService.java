package home.kulkis.userservice.service;

import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.enums.RoleName;
import home.kulkis.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;


    public User createUser(User user) {
        user.setCreatedDateTime(LocalDateTime.now());
        user.getRoles().add(roleService.getRoleByName(RoleName.USER));

        return userRepository.save(user);
    }
}
