package Unit3_Booleans_IfStatements.examples.Student;

public class Student {
    private String fName;
    private String lName;
    private int idNum;

    public Student(String fName, String lName, int idNum) {
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {return fName; }
    public void setfName(String fName) { this.fName = fName; }
    public String getlNAme() { return lName; }
    public void setlNAme(String lNAme) { this.lName = lNAme; }
    public int getIdNum() { return idNum; }
    public void setIdNum(int idNum) { this.idNum = idNum; }

    //return true if they have the same first and last name
    public boolean equals(Student other){
        if(this.fName.equals(other.fName) && this.lName.equals(other.lName)){
            return true;
        } else {
            return false;
        }
    }

    //return id this comes first and negative if other comes first
    public int compareTo(Student other){
        int lastNameCompare = this.lName.compareTo(other.lName);
        if(lastNameCompare > 0 || lastNameCompare < 0){
            return lastNameCompare;
        } else { //same last name
            return this.fName.compareTo(other.fName);
        }
    }
}
