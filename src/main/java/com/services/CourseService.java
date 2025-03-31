package com.services;

import com.entity.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    public String getHome();
    public Course getCourse(String id);
}
