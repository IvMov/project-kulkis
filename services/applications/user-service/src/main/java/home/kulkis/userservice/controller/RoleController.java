package home.kulkis.userservice.controller;

import home.kulkis.userservice.entity.user.Role;
import home.kulkis.userservice.enums.RoleName;
import home.kulkis.userservice.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RoleController {

    private final RoleService roleService;

    //dev method for setup application
    @PostMapping("/roles/{roleName}")
    public Role createRole(@PathVariable RoleName roleName) {
        return roleService.createIfNotExist(roleName);
    }

}
