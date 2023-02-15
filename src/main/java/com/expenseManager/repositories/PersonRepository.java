package com.expenseManager.repositories;
import com.expenseManager.models.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<Person, String> {    
    @Query("{emailId:'?0'}")
    public Person findByEmailId(String emailId);
}
