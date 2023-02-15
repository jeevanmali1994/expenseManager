package com.expenseManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.expenseManager.models.Person;
import com.expenseManager.models.UserForm;
import com.expenseManager.service.userService;

@RestController
public class TestController {
    
    @Autowired
    userService userService;

    @GetMapping("/demo")
    public String demo() {
        System.out.println("success");
        return "success";
    }

    @GetMapping("/home")
    public String home() {
       //personRepo.save(new Person("jeevan", "mali", "testemail@jeevan.com"));
       Person person = userService.getPersonByEmailId("testemail@jeevan.com");
       if (person != null) {
        return person.toString();
       }
       return "User not found";
    }

    @PostMapping("/createuser")
    public String createUser(@RequestBody UserForm userForm) {
        if (userForm == null) {
            return "please enter correct data";
        }
        userService.createUser(userForm.getFirstName(), userForm.getLastName(), userForm.getEmailId(), userForm.getPassword());
        return "userSucessfully Created";
    }
    
}
