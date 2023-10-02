package home.kulkis.userservice.entity.user;

import home.kulkis.userservice.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user-details")
@NoArgsConstructor
@Data
public class UserDetails extends BaseEntity {

    private String firstName;

    private String lastName;

    private String country;

    private String city;

    private String address;

    private String phoneNumber;

}
