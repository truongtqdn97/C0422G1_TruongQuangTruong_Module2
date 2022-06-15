package TestingProgramming.test_inheritance;

public class Teacher extends Person{
    private String subject = "IT";

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(int id, String name, boolean gender, String subject) {
        super(id, name, gender);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
