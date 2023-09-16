package home.kulkis.userservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document("user")
@NoArgsConstructor
@Data
public class User {

    @Id
    private UUID id;

    private String name;

    private BigDecimal money;

    private String nesamones;

    private Integer age;

    private LocalDateTime createdDateTime;

    private List<String> pets = new ArrayList<>();

}
