package com.wolfecodes.wintech.controller;

import com.wolfecodes.wintech.dataTransferObject.UserDto;
import com.wolfecodes.wintech.dataTransferObject.WintechResponse;
import com.wolfecodes.wintech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public WintechResponse createAccount(@RequestBody UserDto userDto) {
        return userService.createAccount(userDto);
    }
}
