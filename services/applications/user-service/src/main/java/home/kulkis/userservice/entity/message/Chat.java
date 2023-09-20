package home.kulkis.userservice.entity.message;

import home.kulkis.userservice.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Document("chats")
@NoArgsConstructor
@Data
public class Chat extends BaseEntity {

    private List<UUID> activeParticipants;

    private Map<UUID, List<Message>> messageHistory;
}
