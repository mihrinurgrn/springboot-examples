package com.example.demo.service;

import com.example.demo.model.Reservation;
import com.example.demo.model.User;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface UserService {
    User getUser(String UserName);

    User save(User user);

    User getUserById(Integer UserId);

}