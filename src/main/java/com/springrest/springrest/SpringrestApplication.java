package com.springrest.springrest;

import com.entity.Course;
import com.services.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SpringrestApplication implements CourseService {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

	@RestController
	public static class Mycontroller {
		@GetMapping("/home")
		public String home(){
			return "Welcome to course Application";
		}

		//Get the courses
		@GetMapping("/courses")
		public List <Course> getCourses(){

		}
	}
}
