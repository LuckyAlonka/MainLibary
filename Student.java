package library;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    protected String studentName;
    protected final int idStudent;
    private static int counter = 0;
    protected Publication [] loanedPublications= new Publication [maxLoans];
    protected int loanedNum;
    protected static final int maxLoans = 3;

    public Student(String studentName) {

        this.studentName = studentName;
        this.idStudent = counter;
        counter++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public int getLoanedNum() {
        return loanedNum;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setLoanedNum(int loanedNum) {
        this.loanedNum = loanedNum;
    }

    public String toString (){
        return "Student number:" + this.idStudent + "\tname:" + this.studentName + " loaned-publications:" + this.loanedNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && loanedNum == student.loanedNum && Objects.equals(studentName, student.studentName) && Arrays.equals(loanedPublications, student.loanedPublications);
    }

    public void loanedArray (Publication pub){
        loanedPublications[loanedNum] = pub;
        loanedNum++;
    }


}
