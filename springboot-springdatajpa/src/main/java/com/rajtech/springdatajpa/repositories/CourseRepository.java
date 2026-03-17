package com.rajtech.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rajtech.springdatajpa.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{
	//findByXXX() methods
	public List<Course> findByCourseDuration(String CourseDuration);
	public List<Course> findByCourseFee(int CourseFee);
	public List<Course> findByCourseFeeLessThanEqual(int CourseFee);
	public List<Course> findByCourseFeeGreaterThanEqual(int CourseFee);
	
	//Custom Queries
	@Query(value="select * from course_details",nativeQuery=true)
	public List<Course> getAllCourses();
	
	@Query("from Course") //HQL Query
	public List<Course> getCourses();
	
	@Query(value="select * from course_details where course_fee <= :fee",nativeQuery=true)
	List<Course> getCourseFeeLessThanEqual(int fee);
	
	@Query("from Course where courseFee >= :fee")
	List<Course> getCourseFeeGreaterThanEqual(int fee);
}
