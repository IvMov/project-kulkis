package home.kulkis.userservice.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class UserOutDtoLite {

    private String login;

    private String email;

    private LocalDateTime createdDateTime;

}
