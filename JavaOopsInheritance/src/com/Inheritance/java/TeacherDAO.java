package com.Inheritance.java;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Data Access Object (DAO) for Teacher entity
public class TeacherDAO {

    // Method to save a teacher to the database
    public void saveTeacher(Teacher teacher) {
        String query = "INSERT INTO teachers (name, age, subject) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            // Set query parameters using the teacher's data
            stmt.setString(1, teacher.name);
            stmt.setInt(2, teacher.age);
            stmt.setString(3, teacher.subject);

            // Execute the query to insert the teacher into the database
            stmt.executeUpdate();
            System.out.println("Teacher saved to database.");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

