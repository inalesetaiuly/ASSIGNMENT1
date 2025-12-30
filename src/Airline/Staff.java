package Airline;
public class Staff extends Person {
    private String position;

    public Staff(String id, String name,String position) {
        super(id, name);
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getRole() {
        return "Staff";
    }

    @Override
    public String toString() {
        return "Staff{id='" + getId() + "', name='" + getName() +  "', position='" + position + "'}";
    }
}
