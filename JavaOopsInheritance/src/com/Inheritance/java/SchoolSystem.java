package com.Inheritance.java;

import java.sql.SQLException;

public class SchoolSystem {
	 public static void main(String[] args) throws SQLException {
	        Student student = new Student();
	        student.name = "Tejas";
	        student.age = 26;
	        student.studentId = "S24";

	        StudentDAO studentDAO = new StudentDAO();
	        studentDAO.saveStudent(student);
	        student.displayStudentInfo();

	        Teacher teacher = new Teacher();
	        teacher.name = "Ms. Smith";
	        teacher.age = 35;
	        teacher.subject = "Mathematics";

	        TeacherDAO teacherDAO = new TeacherDAO();
	        teacherDAO.saveTeacher(teacher);
	        teacher.displayTeacherInfo();
	    }

}
