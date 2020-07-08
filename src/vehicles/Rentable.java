package vehicles;

public interface Rentable {
    void rent(String firstName, String lastName, String id);
    void handOver(); //(zwróć) i
    boolean isRent();// (czy samochód jest wypożyczony)
}
