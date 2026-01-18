package Airline;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) throws Exception {

        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/airport_db",
                "postgres",
                "1234"
        );

        System.out.println("Connected!");
    }
}
