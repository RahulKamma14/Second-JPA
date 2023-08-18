package com.example.project.second.course;

import com.example.project.second.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }
    @RequestMapping("topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }
    @RequestMapping(value = "topics/{topicId}/courses/", method = RequestMethod.POST)
    public void createCourse(@RequestBody Course course,@PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.createCourse(course);
    }
    @RequestMapping(value = "topics/{topicId}/courses/{id}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }
    @RequestMapping(value = "topics/{topicId}/courses/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable String id) {

        courseService.deleteCourse(id);
    }
}
