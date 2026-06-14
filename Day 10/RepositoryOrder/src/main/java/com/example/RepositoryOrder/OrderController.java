package com.example.RepositoryOrder;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    OrdersRepository rep = new OrdersRepository();
    @GetMapping
    public List<Orders> getAllOrders(){
        return rep.getOrders();
    }
    @PostMapping
    public Orders postOrder(@RequestBody Orders ord){
        return rep.setOrder(ord);
    }
}
