package Unit2_UsingObjects.Examples;

public class Student {
    // instance variables
    private String name;
    private int gradeLevel;
    private double gpa;

    public Student(String studentName, int aGrade, double aGpa){
        name = studentName;
        gradeLevel = aGrade;
        gpa = aGpa;
    }

    public Student(String studentName){
        name = studentName;
        gradeLevel = 9;
        gpa = -1;
    }
}

