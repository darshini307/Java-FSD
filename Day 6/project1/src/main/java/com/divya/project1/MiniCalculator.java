package com.divya.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniCalculator {
    @GetMapping("/miniCalc/{a}/{b}")
    public String miniCalc(@PathVariable int a, @PathVariable int b){
        StringBuilder sb = new StringBuilder();
        sb.append("Addition ").append(a+b).append("\n");
        sb.append("Subtraction ").append(a-b).append("\n");
        sb.append("Multiplication ").append(a*b).append("\n");

        if(b!=0){
            sb.append("Quotient ").append(a/b).append("\n");
            sb.append("Remainder ").append(a%b).append("\n");
        }
        else{
            sb.append("Quotient Division by Zero is not Allowed\n");
            sb.append("Remainder division by zero is not allowed");
        }
        return "<pre>"+sb.toString()+"</pre>";

    }
}
