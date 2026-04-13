package com.example.CourseManagment.Repositories;

import com.example.CourseManagment.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
