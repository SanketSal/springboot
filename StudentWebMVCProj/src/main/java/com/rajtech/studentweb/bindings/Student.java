package com.rajtech.studentweb.bindings;

import lombok.Data;

@Data
public class Student {
	
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentGender;
	private String course;
	private String[] preferredTimings;

}
