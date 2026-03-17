package com.rajtech.springdatajpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rajtech.springdatajpa.entities.Course;
import com.rajtech.springdatajpa.repositories.CourseRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringbootSpringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootSpringdatajpaApplication.class, args);
		CourseRepository repo = context.getBean(CourseRepository.class);
		//System.out.println(repo.getClass());
		// Insert operation
//		Course c1 = new Course();
//		c1.setCourseId("UI");
//		c1.setCourseName("UI Full Stack");
//		c1.setCourseDuration("3 months");
//		c1.setCourseFee(18000);
//		repo.save(c1);
		// count() method
		//System.out.println("Number of courses = "+repo.count());
		//select operation based on primary key
//		Course c = repo.findById("FSJ").get();
//		System.out.println(c);
		// select all records
//		Iterable<Course> courses = repo.findAll();
//		//courses.forEach(c -> System.out.println(c));
//		courses.forEach(System.outv::println);// method reference
		//Update operation
//		Course c = repo.findById("FSJ").get();
//		c.setCourseFee(25000);
//		repo.save(c);
		// Delete operation based on primary key
//		if(repo.existsById("FSJ"))
//		{
//			repo.deleteById("FSJ");
//		}
//		else
//			System.out.println("Course ID does not exist");

		// Delete all records
		//repo.deleteAll();
		
		// Adding multiple persistent objects using saveAll()
//		Course c1 = new Course("FSJ", "Full Stack Java","4 months",20000);
//		Course c2 = new Course("FSP", "Full Stack Python","3 months",15000);
//		Course c3 = new Course("UI", "UI Full Stack","4 months",18000);
//		Course c4 = new Course("C", "C Language","2 months",10000);
//		Course c5 = new Course("NET", "Full Stack .NET","4 months",19000);
//		
//		List<Course> courses = Arrays.asList(c1,c2,c3,c4,c5);
//		repo.saveAll(courses);
		
		// Using findAllById()	
//		List<String> courseIds = Arrays.asList("FSJ","UI");
//		Iterable<Course> courses = repo.findAllById(courseIds);
//		courses.forEach(System.out::println);

		//  findByXXX() methods
//		List<Course> courses = repo.findByCourseDuration("4 months");
//		courses.forEach(System.out::println);
		
//		List<Course> courses = repo.findByCourseFee(18000);
//		courses.forEach(System.out::println);
		
//		List<Course> courses = repo.findByCourseFeeLessThanEqual(19000);
//		courses.forEach(System.out::println);
		
//		List<Course> courses = repo.findByCourseFeeGreaterThanEqual(18000);
//		courses.forEach(System.out::println);

		// Custom Queries
//		List<Course> courses = repo.getAllCourses();
//		courses.forEach(System.out::println);

		//Custom HQL Queries
//		List<Course> courses = repo.getAllCourses();
//		courses.forEach(System.out::println);

		// Custom SQL Query
//		List<Course> courses = repo.getCourseFeeLessThanEqual(18000);
//		courses.forEach(System.out::println);
		
		// Custom HQL Query
		List<Course> courses = repo.getCourseFeeGreaterThanEqual(18000);
		courses.forEach(System.out::println);

	}

}
