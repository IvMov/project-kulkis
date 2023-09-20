package home.kulkis.userservice.mapper.user;

import home.kulkis.userservice.entity.user.User;
import home.kulkis.userservice.model.user.UserCreateDto;
import home.kulkis.userservice.model.user.UserOutDtoLite;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper{

    User userCreateDtoToUser(UserCreateDto createDto);
    UserOutDtoLite toLiteDto(User user);
}
