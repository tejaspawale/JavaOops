package com.Inheritance.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class StudentDAO {
	
	public void saveStudent(Student student)throws SQLException  {
		String query = "INSERT INTO students (name, age, student_id) VALUES (?, ?, ?)";
		
		try(Connection conn = DBConnection.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query)){
			
			stmt.setString(1,student.name);
			stmt.setInt(2,student.age);
			stmt.setString(3,student.studentId);
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}


