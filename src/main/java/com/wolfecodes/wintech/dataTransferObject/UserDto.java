package com.wolfecodes.wintech.dataTransferObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String address;
    private String city;
    private String accountNumber;
    private BigDecimal balance;
    private String phoneNumber;
    private String alternatePhoneNumber;
    private String status;
    @CreationTimestamp
    private String createdAt;
    @UpdateTimestamp
    private String modifiedAt;
}
