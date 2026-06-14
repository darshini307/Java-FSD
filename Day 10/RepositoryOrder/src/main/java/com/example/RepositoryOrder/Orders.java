package com.example.RepositoryOrder;

public class Orders {
    private int cust_id;
    private String name;

    public int getCust_id(){
        return cust_id;
    }
    public void setCust_id(int cust_id){
        this.cust_id = cust_id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
