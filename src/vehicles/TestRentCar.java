package vehicles;

public class TestRentCar {
    public static void main(String[] args) {
        Vehicle motorBike1 = new MotorBike("Yamaha", 2010, "prosto", 150);
        RentableCar rentableCar = new RentableCar("Toyota Yaris", 2007, "prosto", 5);
        Vehicle[] vehicles = {rentableCar, motorBike1};

        System.out.println("Samochód: " + rentableCar.toString());
        System.out.println("Czy samochód jest teraz wypożyczony? " + rentableCar.isRent());
        rentableCar.turnLeft();
        System.out.println("Samochód jedzie w kierunku: " + rentableCar.getDirection());
        Person person1 = rentableCar.rent("Karol", "Nowak", "ABC1234");
        System.out.println("Czy samochód jest teraz wypożyczony? " + rentableCar.isRent());
        System.out.println("Najemca: " + person1.toString());
        rentableCar.handOver();
        System.out.println("Czy samochód jest teraz wypożyczony? " + rentableCar.isRent());
        //System.out.println("Najemca: " + person1.toString());

    }
}
