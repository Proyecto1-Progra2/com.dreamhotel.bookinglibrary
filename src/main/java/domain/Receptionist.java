package domain;

public class Receptionist extends Person{

    private String employedNumber, username, password;

    public Receptionist(String name, String lastName, String phoneNumber, String employedNumber, String username, String password) {
        super(name, lastName, phoneNumber);
        this.employedNumber = employedNumber;
        this.username = username;
        this.password = password;
    }
++
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
        return "Receptionist{" +
                "employedNumber='" + employedNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
