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

//    abstract void increaseFreq(int increaseFreq);
//    abstract void increaseTemp(int increaseFreq);
//    abstract void increaseParameters(int increaseFreq);
}
