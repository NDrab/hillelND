
public class Address {

    private String street;
    private int zipcode;
    private String city;


    @Override
    public String toString() {
        return "address{" +
                "street='" + street + '\'' +
                ", zipcode=" + zipcode +
                ", city='" + city + '\'' +
                '}';
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String streetName) {
        this.street = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
