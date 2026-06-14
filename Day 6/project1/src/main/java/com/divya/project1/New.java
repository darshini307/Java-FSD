package com.divya.project1;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class New {
    @GetMapping("/hi/{name}")
    public String myName(@PathVariable String name){
        return "Hi "+name;
    }

    @GetMapping("/sumOddEven/{num1}/{num2}")
    public String oddEven(@PathVariable int num1,@PathVariable int num2){
        int sum = num1+num2;
        if(sum%2==0){
            return "Even";
        }
        return "Odd";
    }
    @GetMapping("/eq/{name}")
    public String isEqual(@PathVariable String name){
        String n = name.toLowerCase();
        if(n.equals("divya")){
            return "Yes";
        }
        return "No";
    }

    @GetMapping("/climate/{temp}")
    public String calcClimate(@PathVariable int temp){
        if(temp<0){
            return "Shivering";
        }
        else if(temp<15){
            return "chill";
        }
        else if(temp<24){
            return "Happy";
        }
        else if(temp<30){
            return "Towards Hot";
        }
        else if(temp<=32){
            return "Hotter";
        }
        return "OMG";
    }
    @GetMapping("/intro/{name}/{city}/{course}")
    public String intro(@PathVariable String name, @PathVariable String city, @PathVariable String course){
        return "Hi I am "+name+", from "+city+" ,welcome to "+course;
    }
}
