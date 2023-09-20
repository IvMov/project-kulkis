package home.kulkis.userservice.entity.user;

import home.kulkis.userservice.entity.BaseEntity;
import home.kulkis.userservice.enums.RoleName;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Document("roles")
@NoArgsConstructor
@Data
public class Role extends BaseEntity {

    private RoleName name;

    public Role(RoleName name) {
        this.name = name;
    }
}
