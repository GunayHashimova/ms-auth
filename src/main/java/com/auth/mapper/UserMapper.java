package com.auth.mapper;

import com.auth.dao.UserEntity;
import com.auth.model.UserDto;

public class UserMapper {
    public UserMapper(){

    }

    public static UserDto userEntityToUserDto(UserEntity userEntity){
        return UserDto.builder()
                .id(userEntity.getId())
                .userName(userEntity.getUserName())
                .password(userEntity.getPassword())
                .email(userEntity.getEmail())
                .build();
    }

    public static UserEntity userDtoToUserEntity(UserDto userDto){
        return UserEntity.builder()
                .id(userDto.getId())
                .userName(userDto.getUserName())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .build();
    }
}
