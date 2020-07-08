package computer;

public class Disk extends Element{
    private int amountGB;

    public Disk(String model, String producer, int serialNumber, int amountGB) {
        super(model, producer, serialNumber);
        this.amountGB = amountGB;
    }
}
