package Airline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Passenger("P1","Inal","KZ123","inal.esetajuli@mail.ru"));
        people.add(new Staff("S1","Manager","Stay"));

        List<Flight> flights = new ArrayList<>();

        System.out.println("Create 2 flights:");
        for(int i = 0; i < 2; i++){
            System.out.println("Flight Number: ");
            String fn=sc.nextLine();

            System.out.println("Origin: ");
            String origin = sc.nextLine();

            System.out.println("Destination: ");
            String dest = sc.nextLine();

            System.out.println("Departure Time: ");
            String time = sc.nextLine();

            System.out.println("Seats Available: ");
            int seats = Integer.parseInt(sc.nextLine());

            System.out.println("Price: ");
            double price = Double.parseDouble(sc.nextLine());

            flights.add(new Flight(fn,origin,dest,time,seats,price));
            System.out.println();

            System.out.println("\nPEOPLE:");
            for( Person p: people) {
                System.out.println(p);
            }
            System.out.println("\nFLIGHTS:");
            for( Flight f: flights) {
                System.out.println(f);
            }

            System.out.print("\nSearch flight by number: ");
            String search = sc.nextLine();
            for (Flight f: flights) {
                if (f.getFlightNumber().equalsIgnoreCase(search)) {
                    System.out.println("Found: + f");
                }
            }
            System.out.print("\\nFilter by destination: ");
            String filterDest = sc.nextLine();
            for (Flight f: flights) {
                if (f.getDestination().equalsIgnoreCase(filterDest)) {
                    System.out.println(f);
                }
            }
            flights.sort(Comparator.comparingDouble(Flight::getPrice));
            System.out.println("\nSorted by price");
            for (Flight f: flights) {
                System.out.println(f);
            }
        }
        if (!flights.isEmpty()) {
            Flight copy = new Flight(
                    flights.get(0).getFlightNumber(),
                    "X", "Y", "time", 0, 0
            );
            System.out.println("\nEquals demo:");
            System.out.println(flights.get(0).equals(copy));
        }
    }
}