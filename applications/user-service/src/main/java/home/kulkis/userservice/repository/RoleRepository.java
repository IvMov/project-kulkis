package home.kulkis.userservice.repository;

import home.kulkis.userservice.entity.user.Role;
import home.kulkis.userservice.enums.RoleName;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends MongoRepository<Role, UUID> {

    Optional<Role> findByName(RoleName roleName);

}
