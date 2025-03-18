package com.kevin.spring.security.dto;

import lombok.Data;

@Data
public class UserDataRequest {
    private String userName;
    private String password;
    private String phoneNum;
}
