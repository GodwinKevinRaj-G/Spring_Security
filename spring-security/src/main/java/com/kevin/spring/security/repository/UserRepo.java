package com.kevin.spring.security.repository;

import com.kevin.spring.security.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserData, Integer> {

    //    UserData findByUserName(String userName);

    Optional<UserData> findByUserName(String userName);

}
