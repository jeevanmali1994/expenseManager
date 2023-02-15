package com.expenseManager.service;

import java.util.List;

import com.expenseManager.models.Person;

public interface userService {
    
    public Person getPersonByEmailId(String emailId);
    
    public String createUser(String firstName, String lastName, String emailId, String password);

}
