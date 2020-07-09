package vehicles;

public interface Rentable {
    Person rent(String firstName, String lastName, String id);
    void handOver();
    boolean isRent();
}
