package home.kulkis.userservice.service;

import home.kulkis.userservice.entity.user.Role;
import home.kulkis.userservice.enums.RoleName;
import home.kulkis.userservice.exception.EntityNotFoundException;
import home.kulkis.userservice.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;


    public Role getRoleByName(RoleName roleName) {
        return roleRepository.findByName(roleName)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Role createIfNotExist(RoleName roleName) {
        Optional<Role> roleOptional = roleRepository.findByName(roleName);
        return roleOptional.orElseGet(() -> roleRepository.save(new Role(roleName)));
    }
}
