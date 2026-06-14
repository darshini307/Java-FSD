package com.example.RepositoryLayer;
//Model Class
public class Student {
    private long id;
    private String name;

    public Student(long id,String name){
        this.id = id;
        this.name=name;
    }
    public Long getId(){return id;}
    public String getName(){return name;}
}
