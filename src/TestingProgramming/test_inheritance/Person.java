package TestingProgramming.test_inheritance;

public class Person {
    private int id;
    private String name;
    private boolean gender;

    public Person() {
    }

    public Person(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
