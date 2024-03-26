package com.wolfecodes.wintech.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
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

