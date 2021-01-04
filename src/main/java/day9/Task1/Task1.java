package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Kirill", "456 group");
        Teacher teacher =new Teacher("Elena Mixailovna", "History");

        System.out.println(student);
        System.out.println(teacher);
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();


    }
}
