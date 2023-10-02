package home.kulkis.userservice.entity.user;

import home.kulkis.userservice.entity.BaseEntity;
import home.kulkis.userservice.entity.interaction.Emotion;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Document("user-reactions")
@NoArgsConstructor
@Data
public class UserReactions extends BaseEntity {

    Map<Emotion, List<UUID>> emotionsAndFileIds;

}
