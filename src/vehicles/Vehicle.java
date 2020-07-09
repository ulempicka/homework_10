package vehicles;

public abstract class Vehicle implements Moveable{

    private String name;
    private int year;
    private String direction;

    public Vehicle(String name, int year, String direction) {
        this.name = name;
        this.year = year;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        System.out.println("Skręcam w lewo");
        setDirection("lewo");
    }

    @Override
    public void turnRight() {
        System.out.println("Skręcam w prawo");
        setDirection("prawo");
    }

    @Override
    public void goForward() {
        System.out.println("Jadę prosto");
        setDirection("prosto");
    }

    @Override
    public void goBack() {
        System.out.println("Cofam");
        setDirection("do tyłu");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", direction='" + direction + '\'' +
                '}';
    }
}
