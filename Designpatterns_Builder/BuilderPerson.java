package Designpatterns_Builder;

public class BuilderPerson {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    public BuilderPerson() {
    }
    public BuilderPerson setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public BuilderPerson setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public BuilderPerson setAge(int age) {
        this.age = age;
        return this;
    }
    public BuilderPerson setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person build() {
        return new Person(firstName,lastName,age,address);
    }
}
