package home.kulkis.userservice.entity.file;

import home.kulkis.userservice.entity.BaseEntity;
import home.kulkis.userservice.entity.interaction.Emotion;
import home.kulkis.userservice.enums.FilePrivacy;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Document("files")
@NoArgsConstructor
@Data
//TODO: Extract in file-service, not for efficiency but for to be separated service
public abstract class AbstractFile extends BaseEntity {

    private String name;

    private FilePrivacy privacy;

    private LocalDate dateOfCreation;

    private LocalDateTime uploadedDateTime;

    private String description;

    private List<String> comments;

    private Map<UUID, Emotion> emotions;

    private List<UUID> privacyGroupUsers;

}
