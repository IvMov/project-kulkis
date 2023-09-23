package home.kulkis.userservice.service;

import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.enums.RoleName;
import home.kulkis.userservice.exception.EntityNotFoundException;
import home.kulkis.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

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

    public User getById(UUID id){
        return userRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public User getByLogin(String login) {
        return userRepository.findByLogin(login)
                .orElseThrow(EntityNotFoundException::new);
    }
}
