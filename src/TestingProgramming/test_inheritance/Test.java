package TestingProgramming.test_inheritance;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person(1, "a", true);
        people[1] = new Student(2, "b", false, "C01");
        people[2] = new Teacher(3, "c", true, "Math");
        for (Person p : people) {
            if (p instanceof Student)
                System.out.println(p+ " - studentzz");
            else if (p instanceof Teacher)
                System.out.println(p+ " - teacherzz");
            else System.out.println(p + " - personzzz");
        }
    }
}
