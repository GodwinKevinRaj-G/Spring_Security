package com.kevin.spring.security.controller;

import com.kevin.spring.security.model.PersonDetails;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonDetailsController {

    List<PersonDetails> personDetails = new ArrayList<>(List.of(new PersonDetails(1, "kevin", "java"), new PersonDetails(2, "messi", "football"), new PersonDetails(3, "nadal;", "tennis")));

    @GetMapping("/getPersonDetails")
    public List<PersonDetails> getPersonDetails() {
        return personDetails;
    }

    @PostMapping("/addPersonDetails")
    public PersonDetails addPersonDetails(@RequestBody PersonDetails personData) {
        personDetails.add(personData);
        return personData;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getcsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
