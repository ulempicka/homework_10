package vehicles;

public class MotorBike extends Vehicle{
    private int speedLimit;

    public MotorBike(String name, int year, String direction, int speedLimit) {
        super(name, year, direction);
        this.speedLimit = speedLimit;
    }
}
