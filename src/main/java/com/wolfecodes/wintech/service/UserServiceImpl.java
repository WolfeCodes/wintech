package com.wolfecodes.wintech.service;

import com.wolfecodes.wintech.dataTransferObject.AccountInfo;
import com.wolfecodes.wintech.dataTransferObject.UserDto;
import com.wolfecodes.wintech.dataTransferObject.WintechResponse;
import com.wolfecodes.wintech.entity.User;
import com.wolfecodes.wintech.repository.UserRepository;
import com.wolfecodes.wintech.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public WintechResponse createAccount(UserDto userDto) {
        if(userRepository.existsByEmail(userDto.getEmail())){
            return WintechResponse.builder()
                    .responseCode(AccountUtils.Account_EXISTS_CODE)
                    .responseMessage(AccountUtils.Account_EXISTS_MESSAGE)
                    .accountInfo(null)
                    .build();
        }
        User newUser = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .gender(userDto.getGender())
                .email(userDto.getEmail())
                .address(userDto.getAddress())
                .city(userDto.getCity())
                .accountNumber(AccountUtils.getAccountNumber())
                .balance(BigDecimal.ZERO)
                .email(userDto.getEmail())
                .phoneNumber(userDto.getPhoneNumber())
                .alternatePhoneNumber(userDto.getAlternatePhoneNumber())
                .status("ACTIVE")
                .build();

        User storedUser = userRepository.save(newUser);
        return WintechResponse.builder()
                .responseCode(AccountUtils.Account_CREATION_SUCCESS_CODE)
                .responseMessage(AccountUtils.Account_CREATION_SUCCESS_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .accountBalance(storedUser.getBalance())
                        .accountNumber(storedUser.getAccountNumber())
                        .accountName(storedUser.getFirstName() + " " + storedUser.getLastName())
                        .build())
                .build();
    }
}
