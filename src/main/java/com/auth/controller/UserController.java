package com.auth.controller;


import com.auth.model.UserDto;
import com.auth.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void signUp(@RequestBody UserDto userDto){
        userService.signUp(userDto);
    }

    @GetMapping({"/userName/password"})
    public void signIn(@PathVariable String userName, @PathVariable String password){
        userService.logIn(userName,password);
    }
}
