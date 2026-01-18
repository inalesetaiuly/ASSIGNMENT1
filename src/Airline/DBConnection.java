package Airline;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL="jdbc:postgresql://localhost:5432/airport_db";
    private static final String USER="postgres";
    private static final String PASS="1234";
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL,USER,PASS);
    }
}