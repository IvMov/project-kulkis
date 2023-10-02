package home.kulkis.userservice.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDetailsUpdateDto extends BaseDtoId {

    private String firstName;

    private String lastName;

    private String country;

    private String city;

    private String address;

    private String phoneNumber;

}
