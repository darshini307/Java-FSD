package com.divya.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Add {
    @GetMapping("Add/{num1}/{num2}")
    public String addTwoNum(@PathVariable int num1, @PathVariable int num2){
        int res = num1+num2;
        return "Addition: "+res;
    }
    /*public int addTwoNum(@PathVariable int num1, @PathVariable int num2){
        int res = num1+num2;
        return res;
    }*/
}
