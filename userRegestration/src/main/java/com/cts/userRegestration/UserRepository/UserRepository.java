package com.cts.userRegestration.UserRepository;

import com.cts.userRegestration.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}