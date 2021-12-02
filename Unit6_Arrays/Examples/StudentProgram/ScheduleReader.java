package Unit6_Arrays.Examples.StudentProgram;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScheduleReader {
    public static void main(String[] args) throws FileNotFoundException{
        File myFile = new File("scheduleData.txt");
        Scanner fileIn = new Scanner(myFile);

        int numStudents = fileIn.nextInt();
        fileIn.nextLine();

        Student[] myStudents = new Student[numStudents];
        int studentCount = 0;

        while (fileIn.hasNextLine()){
            String studentName = fileIn.nextLine();
            Course[]  studentCourse = new Course[8];
            for (int i = 0; i < 8; i++) {
                String teacherName = fileIn.nextLine();
                String className =fileIn.nextLine();
                String grade = fileIn.nextLine();
                int period = fileIn.nextInt();
                if (fileIn.hasNextLine()){
                    fileIn.nextLine();
                }

                Course curPeriod = new Course(className, teacherName, grade, period);
                studentCourse[i] = curPeriod;
            }
            Student curStudent = new Student(studentName, studentCourse);
            myStudents[studentCount] = curStudent;
            studentCount++;
        }
        printStudentSchedules(myStudents);
    }


    public static void printStudentSchedules(Student[] studentsArr){
        for (Student s : studentsArr){
            if(s != null) {
                System.out.println(s);
                System.out.println();
            }
        }
    }
}
