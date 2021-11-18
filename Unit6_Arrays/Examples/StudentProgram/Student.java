package Unit6_Arrays.Examples.StudentProgram;

public class Student {
    private String name;
    private Course[] myClasses;


    public Student(String name) {
        this.name = name;
        this.myClasses = new Course[8];
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }
}
