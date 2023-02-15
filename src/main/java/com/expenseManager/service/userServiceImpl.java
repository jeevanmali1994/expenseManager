package com.expenseManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expenseManager.models.LoginData;
import com.expenseManager.models.Person;
import com.expenseManager.repositories.Loginrepository;
import com.expenseManager.repositories.PersonRepository;

@Service
public class userServiceImpl implements userService{

    @Autowired
    PersonRepository personRepo;

    @Autowired
    Loginrepository loginRepo;

    @Override
    public Person getPersonByEmailId(String emailId) {
        return personRepo.findByEmailId(emailId);
    }

    @Override
    public String createUser(String firstName, String lastName, String emailId, String password) {
        Person createdUser = personRepo.save(new Person(firstName, lastName, emailId));
        LoginData createdlogin = loginRepo.save(new LoginData(emailId, password, createdUser.getId()));

        return "";
    }

    
}
