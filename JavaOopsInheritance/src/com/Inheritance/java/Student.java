package com.Inheritance.java;

public class Student extends Person {
	public String studentId;
	
	public void displayStudentInfo(){
		displayInfo();
		System.out.println("StudentId: " +studentId);
	}
	
	

}
