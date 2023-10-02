package home.kulkis.userservice.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class UserOutDto extends BaseDtoId {

    private String login;

    private String email;

    private LocalDateTime createdDateTime;

    private UserDetailsOutDto userDetails;
}
