package com.example.CourseManagment.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServices {
    public List<String> allCourses(){
        List<String> courses = new ArrayList<>();
        courses.add("eng");
        courses.add("urdu");
        courses.add("math");
        courses.add("isl");
        courses.add("comp");

        return courses;
    }
}
