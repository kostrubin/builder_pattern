import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private boolean isAgeVisible;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.getSurname())
                .setAge(1)
                .setAddress(this.getAddress());
    }

    public boolean hasAge() {
        return this.isAgeVisible;
    }

    public boolean hasAddress() {
        return this.address != null && this.address != "";
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return hasAge() ? this.age : 0;
    }

    public String getAddress() {
        return this.address;
    }

    public String setAddress(String address) {
        return this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return this.name + " " +
                this.surname + ", возраст: " +
                this.age + ", город: " +
                this.address;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(surname);
    }
}