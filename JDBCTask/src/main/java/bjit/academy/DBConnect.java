package bjit.academy;

import java.sql.*;
public class DBConnect {
    Connection conn;
    public void doConnectDB() {
        String connectionStr = "jdbc:mysql://localhost:3306/bjit_db";
        String user = "root";
        String password = "";

        // Connect to the database


        {
            try {
                conn = DriverManager.getConnection(connectionStr, user, password);
                System.out.print("DB Connection is seccussful!");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void fetchData() {

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM userTable");

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String bloodGroup = rs.getString("blood_group");
                System.out.println("Name: " + name + ", Age: " + age + ", Blood group: " + bloodGroup);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}