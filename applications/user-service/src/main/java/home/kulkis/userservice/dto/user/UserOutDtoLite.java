package home.kulkis.userservice.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Data
public class UserOutDtoLite extends BaseDtoId{

    private String login;

    private String email;

    private LocalDateTime createdDateTime;

    private UUID userDetailsId;

}
