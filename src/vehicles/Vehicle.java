package vehicles;

public abstract class Vehicle implements Moveable{

    private String name;
    private int year;
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        setDirection("lewo");
    }

    @Override
    public void turnRight() {
        setDirection("prawo");
    }

    @Override
    public void goForward() {
        setDirection("prosto");
    }

    @Override
    public void goBack() {
        setDirection("do tyłu");
    }
}
