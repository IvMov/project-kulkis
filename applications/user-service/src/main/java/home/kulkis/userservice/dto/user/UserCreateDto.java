package home.kulkis.userservice.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserCreateDto {

    private String login;

    private String email;

    private String password;

}
