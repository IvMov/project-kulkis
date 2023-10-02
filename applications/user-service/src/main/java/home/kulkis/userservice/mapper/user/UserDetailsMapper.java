package home.kulkis.userservice.mapper.user;

import home.kulkis.userservice.dto.user.*;
import home.kulkis.userservice.entity.user.UserDetails;
import org.mapstruct.Mapper;

@Mapper
public interface UserDetailsMapper {
        UserDetailsOutDto toDto(UserDetails userDetails);
        UserDetails createFromDto(UserDetailsUpdateDto userDetailsUpdateDto);
}
