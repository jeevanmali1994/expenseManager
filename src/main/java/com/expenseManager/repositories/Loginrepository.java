package com.expenseManager.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.expenseManager.models.LoginData;


public interface Loginrepository extends MongoRepository<LoginData, String>{
    
}
