package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
    public void evaluate(Student student){
        Random rand = new Random();
        int mark = rand.nextInt(4)+2;

        switch (mark) {
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента "
                + student.getName() + " по предмету " + this.subject + " на оценку " + mark);
    }

}
