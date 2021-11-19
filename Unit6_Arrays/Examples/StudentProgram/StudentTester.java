package Unit6_Arrays.Examples.StudentProgram;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Gym", "Dihnam", "A", 1);
        Course per2 = new Course("Honers Chemistry", "Carlson", "B+", 2);
        Course per3 = new Course("Ap Human Geo", "Robak", "A-", 3);
        Course per4 = new Course("Algebra 2/Pre-calc", "Ludois", "B", 4);
        Course per5 = new Course("Comp Sci A", "Moon", "A", 5);
        Course per6 = new Course("Spanish 3", "Serna", "B-", 6);
        Course per7 = new Course("Lunch", 7);
        Course per8 = new Course("Reading", "Syed", "A", 8);


        Course[] sched = {per1,per2,per3,per4,per5,per6,per7,per8};

        Student st1 = new Student("Aashman Sharma", sched);
        System.out.println(st1);
        System.out.println();

        Student st2 = new Student("Sai Kovour");
        System.out.println(st2);
    }
}
