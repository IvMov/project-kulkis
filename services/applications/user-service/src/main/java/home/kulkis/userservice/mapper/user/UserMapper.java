package home.kulkis.userservice.mapper.user;

import home.kulkis.userservice.dto.user.UserOutDto;
import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.dto.user.UserCreateDto;
import home.kulkis.userservice.dto.user.UserOutDtoLite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = UserDetailsMapper.class)
public interface UserMapper{

    User userCreateDtoToUser(UserCreateDto createDto);
    @Mapping(target = "userDetailsId", source = "userDetails.id")
    UserOutDtoLite toLiteDto(User user);
    UserOutDto toDto(User user);
}
