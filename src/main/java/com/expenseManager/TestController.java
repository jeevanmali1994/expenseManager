package com.expenseManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/demo")
    public String home() {
        System.out.println("success");
        return "success";
    }
}
