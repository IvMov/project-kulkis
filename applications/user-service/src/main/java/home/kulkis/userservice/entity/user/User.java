package home.kulkis.userservice.entity.user;

import home.kulkis.userservice.entity.BaseEntity;
import home.kulkis.userservice.enums.TokenProvider;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document("users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User extends BaseEntity {

    private String login;

    private String email;

    private String password;

    private TokenProvider tokenProvider;

    @DBRef(lazy = true)
    private List<Role> roles = new ArrayList<>();

    private LocalDateTime createdDateTime;

    @DBRef(lazy = true)
    private UserDetails userDetails;

//    TODO: STEP 2 - file service
//    @DBRef(lazy = true)
//    private List<AbstractFile> files = new ArrayList<>();

//    @DBRef(lazy = true)
//    private UserReactions userReactions;

//    TODO: STEP 3 - pet service
//    @DBRef(lazy = true)
//    private List<AbstractPet> ownedPets = new ArrayList<>();
//
//    @DBRef(lazy = true)
//    private List<AbstractPet> subscribedPEts = new ArrayList<>();
//

//    TODO: STEP 4 - chats service
//    @DBRef(lazy = true)
//    private List<Chat> chats = new ArrayList<>();

}
