package home.kulkis.userservice.repository.customize;

import home.kulkis.userservice.entity.BaseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface UuidMongoRepository<T extends BaseEntity> extends MongoRepository<T, UUID> {
}
