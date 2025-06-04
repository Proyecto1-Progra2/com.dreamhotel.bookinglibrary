package domain;

public class Host extends Person{

    private String id, address, email, country;

    public Host(String id, String name, String lastName, int phoneNumber, String address, String email, String country) {
        super(name, lastName, phoneNumber);
        this.id = id;
        this.address = address;
        this.email = email;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "|||"+this.id+"|||"+this.name+"|||"+this.lastName+"|||"+this.phoneNumber+"|||"+this.address+"|||"+this.email+"|||"+this.country;
    }
}
