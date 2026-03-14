package com.rajtech.springdatajpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table (name = "course_details")
public class Course {
	@Id
	@Column (name = "course_id")
	private String courseId;
	@Column (name = "course_name")
	private String courseName;
	@Column (name = "course_duration")
	private String courseDuration;
	@Column ( name = "course_fee")
	private int courseFee;

}
