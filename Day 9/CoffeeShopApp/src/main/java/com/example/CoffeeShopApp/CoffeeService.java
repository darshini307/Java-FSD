package com.example.CoffeeShopApp;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {
    private List<Coffee> orders = new ArrayList<>();
    public void saveOrder(Coffee coffee){
        orders.add(coffee);
    }
    public List<Coffee> getOrders(){
        return orders;
    }
}
