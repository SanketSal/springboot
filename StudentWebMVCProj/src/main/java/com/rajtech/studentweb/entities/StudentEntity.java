package com.rajtech.studentweb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name="student_details")
public class StudentEntity {
	@Id
	@GeneratedValue
	@Column (name="student_id")
	private int studentId;
	@Column (name="student_name")
	private String studentName;
	@Column (name="student_email")
	private String studentEmail;
	@Column (name="student_gender")
	private String studentGender;
	@Column (name="course	")
	private String course;
	@Column (name="preferred_timings")
	private String preferredTimings;

}
