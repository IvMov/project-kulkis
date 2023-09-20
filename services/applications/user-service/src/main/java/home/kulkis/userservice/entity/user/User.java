package home.kulkis.userservice.entity.user;

import home.kulkis.userservice.entity.BaseEntity;
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


    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
