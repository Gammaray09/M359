package Unit6_Arrays.Examples.StudentProgram;

public class Course {
    private String subject;
    private String teacherName;
    private String currentGrade;
    private int period;


    // this constructor is for a course where all fields are passed in
    public Course(String subject, String teacherName, String currentGrade, int period) {
        this.subject = subject;
        this.teacherName = teacherName;
        this.currentGrade = currentGrade;
        this.period = period;
    }


    // for a course without a teacher/grade (lunch, study hall, etc.)
    public Course(String subject, int currentGrade) {
        this.subject = subject;
        this.period = period;
        teacherName = "None";
        this.currentGrade = "None";
    }
    //getters and setters
    public String getSubject() {return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getTeacherName() { return teacherName; }
    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }
    public String getCurrentGrade() {return currentGrade; }
    public void setCurrentGrade(String currentGrade) { this.currentGrade = currentGrade; }
    public int getPeriod() { return period; }
    public void setPeriod(int period) { this.period = period; }


    //Create a toString method that returns course data on one line
    public String toString() {
        return "\tPeriod:" + this.period + ": "
                + this.subject + "(" + this.teacherName + "), Grade:" + this.currentGrade;
    }
}
