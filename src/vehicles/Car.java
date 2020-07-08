package vehicles;

public class Car extends Vehicle{
    private int seatNumber;

    public Car(String name, int year, String direction, int seatNumber) {
        super(name, year, direction);
        this.seatNumber = seatNumber;
    }
}
