package home.kulkis.userservice.entity.file;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("files")
@NoArgsConstructor
@Data
public class Video extends AbstractFile {

    private Long length;
}
