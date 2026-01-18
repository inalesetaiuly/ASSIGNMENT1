package Airline;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FlightDAO {

    public static void insertFlight(Flight f) throws Exception {
        String sql = "INSERT INTO flights VALUES (?, ?, ?, ?, ?, ?)";

        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, f.getFlightNumber());
        ps.setString(2, f.getOrigin());
        ps.setString(3, f.getDestination());
        ps.setString(4, f.getDepartureTime());
        ps.setInt(5, f.getSeatsAvailable());
        ps.setDouble(6, f.getPrice());

        ps.executeUpdate();
        conn.close();
    }

    public static void readFlights() throws Exception {
        String sql = "SELECT * FROM flights";
        Connection conn = DBConnection.getConnection();
        ResultSet rs = conn.createStatement().executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getString("flight_number") + " " +
                            rs.getString("origin") + " > " +
                            rs.getString("destination")
            );
        }
        conn.close();
    }

    public static void updateSeats(String flightNumber, int seats)
            throws Exception {

        String sql = "UPDATE flights SET seats_available=? WHERE flight_number=?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, seats);
        ps.setString(2, flightNumber);
        ps.executeUpdate();
        conn.close();
    }

    public static void deleteFlight(String flightNumber) throws Exception {
        String sql = "DELETE FROM flights WHERE flight_number=?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, flightNumber);
        ps.executeUpdate();
        conn.close();
    }
}
