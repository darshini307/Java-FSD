package com.divya.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @GetMapping("/add/{num1}/{num2}")
    public int addTwoNum(@PathVariable int num1,@PathVariable int num2){
        int res = num1+num2;
        System.out.println("Addition: ");
        return res;
    }
    @GetMapping("/sub/{num1}/{num2}")
    public int subTwoNum(@PathVariable int num1,@PathVariable int num2){
        int res = num1-num2;
        System.out.println("Subtraction");
        return res;
    }
    @GetMapping("/mul/{num1}/{num2}")
    public int mulTwoNum(@PathVariable int num1,@PathVariable int num2){
        int res = num1*num2;
        System.out.println("Multipliction");
        return res;
    }
    @GetMapping("/div/{num1}/{num2}")
    public int divTwoNum(@PathVariable int num1,@PathVariable int num2){
        int res = num1/num2;
        System.out.println("Add: ");
        return res;
    }
}
