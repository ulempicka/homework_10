package computer;

public class Computer {
    private Processor processor;
    private Ram ram;
    private Disk disk;

    public Computer(Processor processor, Ram ram, Disk disk) {
        this.processor = processor;
        this.ram = ram;
        this.disk = disk;
    }
}
