package com.bechalor.sealthedeal.Reprository;

import com.bechalor.sealthedeal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReprositor extends JpaRepository<User,Integer> {
    public User findByEmail(String email);
}
