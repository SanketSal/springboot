package com.rajtech.springdatajpa;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.rajtech.springdatajpa.entities.Employee;
import com.rajtech.springdatajpa.repositories.CourseRepository;
import com.rajtech.springdatajpa.repositories.EmployeeRepository;

@SpringBootApplication
public class Application {

    private final CourseRepository courseRepository;

    Application(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		
//		Employee e1 = new Employee(101,"Raj","Manager",90000);
//		Employee e2 = new Employee(102,"Ramu","Tester",60000);
//		Employee e3 = new Employee(103,"Smith","Developer",75000);
//		Employee e4 = new Employee(104,"Ramesh","Tester",50000);
//		Employee e5 = new Employee(105,"John","HR",55000);
//		Employee e6 = new Employee(106,"Mary","Developer",70000);
//		Employee e7 = new Employee(107,"Ramya","HR",65000);
//		Employee e8 = new Employee(108,"Satish","Developer",80000);
//		
//		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
//		repo.saveAll(employees);

		//Pagination
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Page Number");
//		int pageNum = s.nextInt();
//		int pageSize = 3;
//		List<Employee> employees = repo.findAll();
//		employees.forEach(System.out::println);
		// page number will start from 0

//		PageRequest pageRequest = PageRequest.of(pageNum - 1, pageSize);
//		Page<Employee> pages = repo.findAll(pageRequest);
//		List<Employee> employees =  pages.getContent();
//		employees.forEach(System.out::println);
		
		//Sorting - Ascending
//		List<Employee> employees = repo.findAll(Sort.by("empName"));
//		employees.forEach(System.out::println);

		// Sorting - Descending
//		List<Employee> employees = repo.findAll(Sort.by("empName").descending());
//		employees.forEach(System.out::println);
		
		// Sorting based on empSalary
		List<Employee> employees = repo.findAll(Sort.by("empSalary"));
		employees.forEach(System.out::println);


	}

}
