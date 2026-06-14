package com.example.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class New {
    @GetMapping("/greet")
    public GreetResponse greet(String greet){
        return new GreetResponse("Hello");
    }
    record GreetResponse(String greet){

    }
}
