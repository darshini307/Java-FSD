package com.example.FullStackApplication1;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "students")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;
    @Column(name="student_name",nullable = false,length = 100)
    private String name;
    private String department;
    private String grade;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id",referencedColumnName = "id")
    private Profile profile;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Course> courses; //one student has many courses
}
