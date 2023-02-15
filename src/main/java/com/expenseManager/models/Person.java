package com.expenseManager.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("person")
@Data
public class Person {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String emailId;
    
    public Person(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
}
