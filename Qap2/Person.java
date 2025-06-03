public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = new Address(home);
    }

    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.home = new Address(other.home);
    }

    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}
