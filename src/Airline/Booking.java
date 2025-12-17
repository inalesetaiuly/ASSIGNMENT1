package Airline;

public class Booking {
    private String bookingID;
    private Flight flight;
    private Passenger passenger;
    private String seatNumber;
    private String status;

    public Booking(String bookingID, Flight flight, Passenger passenger, String seatNumber, String status) {
        this.bookingID = bookingID;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.status = status;
    }
    public String getBookingID() {
    return bookingID;
    }
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", flight='" + flight + '\'' +
                ", passenger='" + passenger + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}