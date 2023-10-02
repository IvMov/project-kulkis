package home.kulkis.userservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Getter
@Setter
public abstract class BaseEntity {

    @MongoId
    private UUID id;
}
