package computer;

public class TestComputer {
    public static void main(String[] args) {

        Element processor = new Processor("Core i7", "Intel", 545414, 2600, 55);
        Element ram = new Ram("Impact DDR", "Kingston", 664363, 32, 3200, 45);
        Element disk = new Disk("Ultimate SSD", "Adata", 43566, 500);
        Computer computer1 = new Computer(processor, ram, disk);

        int increaseFreq = 5;
        //processor.increaseParameters(increaseFreq);
    }
}
