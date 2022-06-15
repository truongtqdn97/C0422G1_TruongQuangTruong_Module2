package TestingProgramming.test_inheritance;

public class Student extends Person{
    private String className = "C04";

    public Student() {
    }

    public Student(int id, String name, boolean gender, String className) {
        super(id, name, gender);
        this.className = className;
    }

    public Student(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                '}';
    }
}
