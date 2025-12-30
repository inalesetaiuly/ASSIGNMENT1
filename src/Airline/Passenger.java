package Airline;

public class Passenger extends Person {
    private String passportNumber;
    private String email;

    public Passenger(String id, String name, String passportNumber, String email) {
        super(id, name);
        this.passportNumber = passportNumber;
        this.email = email;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public String toString() {
        return "Passenger{id='" + getId() + "', name'" + getName() + "', passportNumber='" + passportNumber + "', email='" + email + "'}";
    }
}