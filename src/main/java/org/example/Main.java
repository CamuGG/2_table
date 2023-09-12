package org.example;
import java.sql.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "developerCamu*@");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()){
                int studentId = resultSet.getInt("student_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");

                System.out.println("ID: " + studentId +
                        "\n" + "lastname: " + lastName +
                        "\n" + "name: " + firstName);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
