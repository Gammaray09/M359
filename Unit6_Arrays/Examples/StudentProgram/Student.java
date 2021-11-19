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

    // create a toString method that returns student name and student classes
    public String toString(){
        String classes = "";
        if (this.myClasses[0] == null){
            classes = "\tDoes not yet have any Classes";
        }else{
            for (int i = 0; i < myClasses.length; i++) {
                classes += myClasses[i].toString() + "\n";
            }
        }
        return "Student:" + this.name +"\n" + classes;
    }
}
