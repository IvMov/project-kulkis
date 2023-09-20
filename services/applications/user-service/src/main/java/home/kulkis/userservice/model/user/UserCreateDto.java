package home.kulkis.userservice.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserCreateDto {

    private String login;

    private String email;

    private String password;

}
