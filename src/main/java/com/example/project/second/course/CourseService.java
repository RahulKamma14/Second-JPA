package com.example.project.second.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    private List<Course> courses = new ArrayList<>(Arrays.asList(
        new Course("spring", "Spring Framework", "Spring Framework Description"),
        new Course("java", "Core Java", "Core Java Description"),
        new Course("javascript", "JavaScript", "JavaScript Description")
    ));
    public List<Course> getAllCourses() {
        List<Course> topics = new ArrayList<>();
        courseRepository.findAll().forEach(topics::add);
        return topics;
    }
    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public void createCourse(Course topic) {
        courseRepository.save(topic);

    }

    public void updateCourse(Course topic, String id) {
        courseRepository.save(topic);
    }



    public void deleteCourse(String id) {
            courseRepository.deleteById(id);}
        }
