package com.example.CourseManagment.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    public int courseId;


    public String courseName;

}
