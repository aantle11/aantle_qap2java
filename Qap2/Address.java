public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.state = other.state;
        this.zip = other.zip;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}