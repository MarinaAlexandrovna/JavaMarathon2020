package day9.Task1;

public class Student extends Human {
    private String groupName;


    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public Student(String kirill) {
        super();
    }

    public String getGroupName() {
        return groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с иминем - " + getName());
    }
    public String toString(){
        return groupName;
    }
}
