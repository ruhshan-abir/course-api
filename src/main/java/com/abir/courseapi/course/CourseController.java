package com.abir.courseapi.course;

import com.abir.courseapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topic_id}/courses/{course_id}")
    public Course getCourse(@PathVariable String topic_id, String course_id){
        return courseService.getCourse(course_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topic_id}/courses")
    public void addCourse(@RequestBody Course course){
        course.setTopic(new Topic());
        courseService.addCourse(course);
    }






}
