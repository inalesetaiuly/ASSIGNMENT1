package Airline;

public class Main {
    public static void main(String[] args) throws Exception {

        Flight f = new Flight(
                "KZ101",
                "Almaty",
                "Astana",
                "10:00",
                100,
                25000
        );

        FlightDAO.deleteFlight("KZ101");

    }
}