package com.kevin.spring.security.service;

import com.kevin.spring.security.model.UserData;
import com.kevin.spring.security.model.UserPrincipal;
import com.kevin.spring.security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserData userData = userRepo.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
        return new UserPrincipal(userData);
    }

}
