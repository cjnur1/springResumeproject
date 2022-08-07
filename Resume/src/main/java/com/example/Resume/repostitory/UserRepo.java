package com.example.Resume.repostitory;

import com.example.Resume.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {



}
