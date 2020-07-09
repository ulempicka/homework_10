package computer;

public class Ram extends Element implements Tuning {
    private static final int INCREASE_TEMP = 15;
    private static final int INCREASE_FREQ = 100;
    private int amountGB;
    private int frequencyMHz;
    private int temp;
    private static final int MAX_TEMP = 60;

    public Ram(String model, String producer, int serialNumber, int amountGB, int frequencyMHz, int temp) {
        super(model, producer, serialNumber);
        this.amountGB = amountGB;
        this.frequencyMHz = frequencyMHz;
        this.temp = temp;
    }

    void increaseFreq(int increase) {
        frequencyMHz += increase;
    }

    public void increaseTemp(int increaseFreq) {
        int increaseTemp = increaseFreq * INCREASE_TEMP / INCREASE_FREQ;
        System.out.println("Wzrost temperatury ramu o: " + increaseTemp);
        temp += increaseTemp;
    }

    @Override
    public void increaseParameters(int increaseFreq) {
        if (temp < MAX_TEMP) {
            increaseFreq(increaseFreq);
            increaseTemp(increaseFreq);
        } else {
            System.out.println("UWAGA! Temperatura maxymalna RAMu!");
        }
    }

    @Override
    public String toString() {
        return "Ram{" +
                "amountGB=" + amountGB +
                ", frequencyMHz=" + frequencyMHz +
                ", temp=" + temp +
                '}' + super.toString();
    }
}
