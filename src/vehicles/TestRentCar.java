package vehicles;

public class TestRentCar {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota Yaris", 2007, "prosto", 5);
        Vehicle motorBike1 = new MotorBike("Yamaha", 2010, "prosto", 150);

        Vehicle[] vehicles = {car1, motorBike1};
        Person person1 = new Person("Karol", "Nowak", "ABC1234");

        RentableCar rentableCar = new RentableCar("", 2007, "", 5);
        //rentableCar.rent();

    }
}
