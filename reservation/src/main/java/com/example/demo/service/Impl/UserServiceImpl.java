package com.example.demo.service.Impl;

import com.example.demo.model.Reservation;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String userName) {
        User user = userRepository.findByUserName(userName);
        return user;

    }

    @Override
    public User save(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    @Override
    public User getUserById(Integer UserId) {
        User user = userRepository.findUserByUserId(UserId);
        return user;
    }


}
