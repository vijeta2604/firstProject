package com.controller;

import com.entity.model.Course;
import com.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return courseService.getHome();
    }

    @PostMapping("/getCourse/{id}")
    public Course getCourse(@RequestParam("id") String id){
        return courseService.getCourse(id);
    }
}
