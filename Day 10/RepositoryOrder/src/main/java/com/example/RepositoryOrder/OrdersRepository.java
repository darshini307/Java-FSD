package com.example.RepositoryOrder;
import java.util.*;
public class OrdersRepository {
    Orders ord = new Orders();
    List<Orders> order = new ArrayList<>();
    int cust_id = 0;
    public List<Orders> getOrders(){
        return order;
    }
    public Orders setOrder(Orders o){
        o.setCust_id(++cust_id);
        order.add(o);
        return o;
    }
}
