package com.wolfecodes.wintech.repository;

import com.wolfecodes.wintech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
