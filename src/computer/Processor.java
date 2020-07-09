package computer;

public class Processor extends Element implements Tuning {
    private static final int INCREASE_TEMP = 10;
    private static final int INCREASE_FREQ = 100;
    private int frequencyMHz;
    private int temp;
    private static final int MAX_TEMP = 70;

    public Processor(String model, String producer, int serialNumber, int frequencyMHz, int temp) {
        super(model, producer, serialNumber);
        this.frequencyMHz = frequencyMHz;
        this.temp = temp;
    }

    public void setFrequencyMHz(int frequencyMHz) {
        this.frequencyMHz = frequencyMHz;
    }

    public int getFrequencyMHz() {
        return frequencyMHz;
    }

    public void increaseFreq(int increaseFreq) {
        frequencyMHz += increaseFreq;
    }

    public void increaseTemp(int increaseFreq) {
        int increaseTemp = increaseFreq * INCREASE_TEMP / INCREASE_FREQ;
        System.out.println("Wzrost temperatury procesora o: " + increaseTemp);
        temp += increaseTemp;
    }

    @Override
    public void increaseParameters(int increaseFreq) {
        if (temp < MAX_TEMP) {
            increaseFreq(increaseFreq);
            increaseTemp(increaseFreq);
        } else {
            System.out.println("UWAGA! Temperatura maxymalna procesora!");
        }
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequencyMHz=" + frequencyMHz +
                ", temp=" + temp +
                '}' + super.toString();
    }
}
