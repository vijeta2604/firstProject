package com.services.impl;

import com.entity.CourseTable;
import com.entity.model.Course;
import com.services.CourseService;

import java.sql.SQLException;

public class CourseServiceimpl implements CourseService {

    @Override
    public String getHome() {
        return "This is home";
    }

    @Override
    public Course getCourse(String id) {
        try {
            return new CourseTable().getCourseById(id);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
