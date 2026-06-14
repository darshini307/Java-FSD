package com.example.StudentCourse;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService {

    private final CourseRepository repo;

    public CourseService(CourseRepository repo){
        this.repo = repo;
    }


    public List<Course> findAll(){
        return repo.findAll();
    }


    public Course save(Course c){
        return repo.save(c);
    }

}
