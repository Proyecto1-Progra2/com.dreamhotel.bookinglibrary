package domain;

public class Person {

    protected String name, lastName;
    protected int phoneNumber;

    public Person(String name, String lastName, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name+"|||"+this.lastName;
    }

    public static Person fromString(String str) {
        String[] parts = str.split("\\|\\|\\|");
        String name = parts[0];
        String lastName = parts[1];
        return new Person(name, lastName, 0); // Se pierde el número telefónico
    }
}
