package com.ex.demo1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/name")
    public String sayName(){
        return "hi I am Divya Darshini";
    }
    @GetMapping("/Address")
    public String sayAddress(){
        return "29- Kalyani Nagar, Gobi";
    }
    @GetMapping("/favColor")
    public String sayFavColor(){
        return "My Favourite Color - Blue";
    }
    @GetMapping("/age")
    public String myAge(){
        return "My Age : 19";
    }
    @GetMapping("/greet")
    public greetResponse greetResponse(){
        return new greetResponse("Hello");
    }
    record greetResponse(String name){
        
    }

}
