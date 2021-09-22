package Unit3_Booleans_IfStatements.examples.Student;

public class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Aashman" ,"Sharma" , 1234 );
        Student student2 = new Student("Neil" ,"Armstrong" , 5674 );
        Student student3 = new Student("Elon" ,"Musk" , 9772 );
        Student student4 = new Student("Steven" ,"Hawking" , 8366 );

        System.out.println(student1.equals(student2));
        System.out.println(student3.equals(student4));
        System.out.println("");
        System.out.println("");
        System.out.println(student1.compareTo(student2));
        System.out.println(student4.compareTo(student4));


    }
}
