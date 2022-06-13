package ss5.thuc_hanh.static_method;

import static ss5.thuc_hanh.static_method.Student.*;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        //create new objects
        Student s1 = new Student(1, "Tay");
        Student s2 = new Student(2, "Mon");
        Student s3 = new Student(3, "Khanh");

        //call display method
        s1.display();
        s2.display();
        s3.display();
    }
}
