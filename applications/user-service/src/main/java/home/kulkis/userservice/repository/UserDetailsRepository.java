package home.kulkis.userservice.repository;

import home.kulkis.userservice.entity.user.UserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserDetailsRepository extends MongoRepository<UserDetails, UUID> {
}
