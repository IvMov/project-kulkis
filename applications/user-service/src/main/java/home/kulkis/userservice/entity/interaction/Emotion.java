package home.kulkis.userservice.entity.interaction;

import home.kulkis.userservice.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("emotions")
@NoArgsConstructor
@Data
public class Emotion extends BaseEntity {

    private String name;

    private String image;

}
