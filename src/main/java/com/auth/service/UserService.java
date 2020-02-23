package com.auth.service;

import com.auth.model.UserDto;

public interface UserService {
    void signUp(UserDto userDto);

    void logIn(String userName,String password);
}
