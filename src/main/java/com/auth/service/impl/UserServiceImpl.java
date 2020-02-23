package com.auth.service.impl;

import com.auth.dao.UserEntity;
import com.auth.mapper.UserMapper;
import com.auth.model.UserDto;
import com.auth.repository.UserRepository;
import com.auth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void signUp(UserDto userDto) {
        userRepository.save(UserMapper.userDtoToUserEntity(userDto));
    }

    @Override
    public void logIn(String userName, String password) {
        for(UserEntity userEntity:userRepository.findAll()){
            if(userEntity.getUserName().equals(userName)){
                if(userEntity.getPassword().equals(password)){
                    System.out.println("OK");
                }else System.out.println("Error password");
            }else System.out.println("Error userName");
        }
    }
}
