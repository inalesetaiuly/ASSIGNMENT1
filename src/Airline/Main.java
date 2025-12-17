package Airline;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("KC978","Oral","Astana","2025-12-20 17:00", 50,45000.0);
        Flight flight2 = new Flight("KC768","Almaty","Dubai","2025-12-25 06:00",30,120000.0);

        Passenger passenger1 = new Passenger("P001","INAL YESSETAIULY","KZ432246", "inal.esetaiuly@outlook.com");
        Passenger passenger2= new Passenger("P002","ALY AKILBEK","KZ502661","akylbekali@gmail.com");

        Booking booking1 = new Booking("B001", flight1, passenger1,"24A","CONFIRMED");
        Booking booking2 = new Booking("B002", flight2, passenger2,"12C","PENDING");

        System.out.println("Flights=");
        System.out.println(flight1);
        System.out.println(flight2);

        System.out.println("\n Passengers=");
        System.out.println(passenger1);
        System.out.println(passenger2);

        System.out.println("\n Booking=");
        System.out.println(booking1);
        System.out.println(booking2);

        System.out.println("\n Comparison=");

        if (flight1.getSeatsAvailable() > flight2.getSeatsAvailable()) {
            System.out.println("Flight " + flight1.getFlightNumber() + " has more available seats than " + flight2.getFlightNumber());
        } else if (flight1.getSeatsAvailable() < flight2.getSeatsAvailable()) {
            System.out.println("Flight " + flight2.getFlightNumber() + " has more available seats than " + flight1.getFlightNumber());
        } else {
            System.out.println("Flights " + flight1.getFlightNumber() + " and " + flight2.getFlightNumber() + " have the same number of available seats.");
        }

    }
}