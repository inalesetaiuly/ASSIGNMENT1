package Airline;

public class Passenger {
    private String passengerId;
    private String name;
    private String passportNumber;
    private String email;

    public Passenger(String passengerId, String name, String passportNumber, String email) {
        this.passengerId = passengerId;
        this.name = name;
        this.passportNumber = passportNumber;
        this.email = email;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String toString() {
        return "Passenger{" +
                "passengerId='" + passengerId + '\'' +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
