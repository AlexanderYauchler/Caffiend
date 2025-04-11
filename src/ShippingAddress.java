public class ShippingAddress {
    String streetAddress;
    String city;
    String state;
    String country;
    String zip;

    ShippingAddress(
        String streetAddress,
        String city,
        String state,
        String country,
        String zip
    ) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
}
