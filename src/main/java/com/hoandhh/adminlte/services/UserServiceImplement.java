package com.hoandhh.adminlte.services;

import com.hoandhh.adminlte.models.User;
import com.hoandhh.adminlte.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
