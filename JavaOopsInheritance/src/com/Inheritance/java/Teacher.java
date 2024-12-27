package com.Inheritance.java;


//Subclass of Person representing a teacher
public class Teacher extends Person {
 public String subject; // Subject taught by the teacher

 // Method to display teacher-specific information
 public void displayTeacherInfo() {
     displayInfo(); // Calls the base class method to print name and age
     System.out.println("Subject: " + subject);
 }
}
