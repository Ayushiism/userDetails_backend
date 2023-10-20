package com.example.userDetails_backend.repository;

import com.example.userDetails_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
