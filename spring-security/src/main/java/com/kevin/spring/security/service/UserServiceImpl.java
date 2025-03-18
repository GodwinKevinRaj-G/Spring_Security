package com.kevin.spring.security.service;

import com.kevin.spring.security.dto.UserDataRequest;
import com.kevin.spring.security.model.UserData;
import com.kevin.spring.security.repository.UserRepo;
import com.kevin.spring.security.utility.UserDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserDataMapper userDataMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserData registerUserData(UserDataRequest userDataRequest) {
        if (userRepo.findByUserName(userDataRequest.getUserName()).isPresent()) {
            throw new RuntimeException("Username already exists!");
        }
        UserData userData = userDataMapper.toEntity(userDataRequest);
        userData.setPassword(passwordEncoder.encode(userDataRequest.getPassword()));
        return userRepo.save(userData);
    }
}