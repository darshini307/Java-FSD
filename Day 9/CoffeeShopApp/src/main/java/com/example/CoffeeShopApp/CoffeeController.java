package com.example.CoffeeShopApp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService coffeeService;
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }
    @PostMapping
    public String addOrder(@RequestBody Coffee coffee){
        coffeeService.saveOrder(coffee);
        return "Order recieved";
    }
    @GetMapping
    public List<Coffee> viewOrders(){
        return coffeeService.getOrders();
    }
}
