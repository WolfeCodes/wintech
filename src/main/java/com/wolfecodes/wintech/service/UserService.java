package com.wolfecodes.wintech.service;

import com.wolfecodes.wintech.dataTransferObject.UserDto;
import com.wolfecodes.wintech.dataTransferObject.WintechResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    WintechResponse createAccount(UserDto userDto);


}
