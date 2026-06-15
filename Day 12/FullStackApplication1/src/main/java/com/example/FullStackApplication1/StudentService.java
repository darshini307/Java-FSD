package com.example.FullStackApplication1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> findAll(){
        return repo.findAll();
    }
    public Student save(Student s){
        return repo.save(s);
    }

}
