package com.example.coffeeOrder;

import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service){
        this.service=service;
    }
    @PostMapping
    public Coffee orderCoffee(@RequestBody Coffee coffee){
        return service.orderCoffee(coffee);
    }
    @GetMapping
    public List <Coffee> getOrders(){
        return service.getOrders();
    }
}