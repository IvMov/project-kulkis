package home.kulkis.userservice.entity.pet;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pets")
@NoArgsConstructor
@Data
public class Cat extends AbstractPet{
}
