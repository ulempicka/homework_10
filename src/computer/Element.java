package computer;

public abstract class Element {
    private String model;
    private String producer;
    private int serialNumber;

    public Element(String model, String producer, int serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Element{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
