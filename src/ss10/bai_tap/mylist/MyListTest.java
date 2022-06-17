package ss10.bai_tap.mylist;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student(){}

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
    public static void main(String[] args) {
        Student student1 = new Student(1,"Can");
        Student student2 = new Student(2,"Kiem");
        Student student3 = new Student(3,"Liem");
        Student student4 = new Student(4,"Chinh");
        Student student5 = new Student(5,"Chi");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5, 3);



        MyList<Student> newStudentList = new MyList<>();
        newStudentList = studentMyList.clone();
        System.out.println(newStudentList.remove(1));
        for (int i = 0; i < newStudentList.size(); i++) {
            System.out.println(newStudentList.get(i).getName());
        }
        System.out.println(studentMyList.contains(student2));
        System.out.println(studentMyList.indexOf(student5));

//        System.out.println(studentMyList.get(2).getName());
//        studentMyList.clear();
//        studentMyList.size();
//
//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
    }
}
