package com.abir.courseapi.course;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topic_id){
        List<Course> courses = new ArrayList<Course>();

        courseRepository.findAll().forEach(courses::add);

        return courses;
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(String id, Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(String id){
        courseRepository.deleteById(id);
    }




}
