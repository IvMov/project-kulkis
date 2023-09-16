package home.kulkis.userservice.repository;

import home.kulkis.userservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {
}
