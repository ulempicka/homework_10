package computer;

public class TestComputer {
    public static void main(String[] args) {

        Processor processor = new Processor("Core i7", "Intel", 545414, 2600, 55);
        Ram ram = new Ram("Impact DDR", "Kingston", 664363, 32, 3200, 45);
        Disk disk = new Disk("Ultimate SSD", "Adata", 43566, 500);
        Computer computer1 = new Computer(processor, ram, disk);

        System.out.println(processor.toString() + "\n" + ram.toString());
        int increaseFreq = 100;
        processor.increaseParameters(increaseFreq);
        ram.increaseParameters(increaseFreq);
        System.out.println(processor.toString() + "\n" + ram.toString());

        processor.increaseParameters(increaseFreq);
        ram.increaseParameters(increaseFreq);
        System.out.println(processor.toString() + "\n" + ram.toString());

    }
}
