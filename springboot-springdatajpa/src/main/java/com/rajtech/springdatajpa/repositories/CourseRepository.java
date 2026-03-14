package com.rajtech.springdatajpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rajtech.springdatajpa.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{

}
