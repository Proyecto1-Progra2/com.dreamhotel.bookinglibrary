package domain;

public class Receptionist extends Person{

    private String employedNumber, username, password;

    public Receptionist(String employedNumber, String name, String lastName, int phoneNumber, String username, String password) {
        super(name, lastName, phoneNumber);
        this.employedNumber = employedNumber;
        this.username = username;
        this.password = password;
    }

    public String getEmployedNumber() {
        return employedNumber;
    }

    public void setEmployedNumber(String employedNumber) {
        this.employedNumber = employedNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "|||"+this.employedNumber+"|||"+this.name+"|||"+this.lastName+"|||"+this.phoneNumber+"|||"+this.username+"|||"+this.password;
    }
}
