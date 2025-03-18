package com.kevin.spring.security.service;

import com.kevin.spring.security.dto.UserDataRequest;
import com.kevin.spring.security.model.UserData;

public interface UserService {

    UserData registerUserData(UserDataRequest userData);
}
