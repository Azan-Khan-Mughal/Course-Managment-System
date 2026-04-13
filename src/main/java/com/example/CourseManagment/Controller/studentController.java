package com.example.CourseManagment.Controller;

import com.example.CourseManagment.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    StudentServices studentServices;

    @GetMapping
    public ResponseEntity<String>studentTest (){
        return ResponseEntity.ok("hi student");
    }

    @GetMapping("/allCourses")
    public ResponseEntity<List<String>> getAllCourses(){
        return ResponseEntity.ok(studentServices.allCourses());
    }
}
