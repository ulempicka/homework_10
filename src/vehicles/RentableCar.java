package vehicles;

public class RentableCar extends Car implements Rentable{
    private Person person;

    public RentableCar(String name, int year, String direction, int seatNumber) {
        super(name, year, direction, seatNumber);
    }

    @Override
    public Person rent(String firstName, String lastName, String id) {
        System.out.println("Wypożyczam samochód");
        person = new Person(firstName,lastName, id);
        return person;
    }

    @Override
    public void handOver() {
        System.out.println("Zwracam samochód");
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }
}
