package vehicles;

public class RentableCar extends Car implements Rentable{
    private Person person;

    public RentableCar(String name, int year, String direction, int seatNumber) {
        super(name, year, direction, seatNumber);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setId(id);
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }
}
