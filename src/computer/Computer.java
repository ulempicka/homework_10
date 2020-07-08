package computer;

public class Computer {
    private Element processor;
    private Element ram;
    private Element disk;

    public Computer(Element processor, Element ram, Element disk) {
        this.processor = processor;
        this.ram = ram;
        this.disk = disk;
    }
}
