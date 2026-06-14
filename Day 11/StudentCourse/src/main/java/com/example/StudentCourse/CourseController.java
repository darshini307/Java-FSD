package com.example.StudentCourse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }
    @GetMapping
    public List<Course> getCourse(){
        return service.findAll();
    }
    @PostMapping
    public Course save(@RequestBody Course c){
        return service.save(c);
    }
}
