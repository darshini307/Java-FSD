package com.example.OneToOne;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "profile_id")   // FK in student table
    private StudentProfile profile;
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StudentProfile getProfile() {
        return profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(StudentProfile profile) {
        this.profile = profile;
    }
}