package home.kulkis.userservice.repository.customize;

import home.kulkis.userservice.entity.BaseEntity;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.UUID;

public class UuidMongoRepositoryImpl<T extends BaseEntity> extends SimpleMongoRepository<T, UUID> implements UuidMongoRepository<T> {
    /**
     * Creates a new {@link SimpleMongoRepository} for the given {@link MongoEntityInformation} and {@link MongoTemplate}.
     *
     * @param metadata        must not be {@literal null}.
     * @param mongoOperations must not be {@literal null}.
     */
    public UuidMongoRepositoryImpl(MongoEntityInformation<T, UUID> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    @Override
    public <S extends T> S save(S entity) {
        setId(entity);
        return super.save(entity);
    }

    @Override
    public <S extends T> S insert(S entity) {
        setId(entity);
        return super.insert(entity);
    }

    private <S extends T> void setId(S entity) {
        if (null == entity.getId()){
            entity.setId(UUID.randomUUID());
        }
    }
}
