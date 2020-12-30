package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Володя");
        Teacher teacher = new Teacher("Ольга Васильевна", "Педагогика");

        teacher.evaluate(student);

    }
}
