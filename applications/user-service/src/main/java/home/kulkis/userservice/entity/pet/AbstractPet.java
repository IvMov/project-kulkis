package home.kulkis.userservice.entity.pet;

import home.kulkis.userservice.entity.BaseEntity;
import home.kulkis.userservice.entity.file.AbstractFile;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("pets")
@NoArgsConstructor
@Data
//TODO: Extract in pet-service, not for efficiency but for to be separated service
public abstract class AbstractPet extends BaseEntity {

    private String coreName;

    private List<String> anotherNames = new ArrayList<>();

    private String whatLikes;

    private String whatNotLikes;

    private String about;

    private List<AbstractFile> files = new ArrayList<>();

}
