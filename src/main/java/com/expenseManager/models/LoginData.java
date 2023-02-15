package com.expenseManager.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("login")
@Data
public class LoginData {

    @Id
    private String id;

    private String emailId;
    private String password;
    private String personTableId;

    public LoginData(String emailId, String password, String personTableId) {
        this.emailId = emailId;
        this.password = password;
        this.personTableId = personTableId;
    }
}
