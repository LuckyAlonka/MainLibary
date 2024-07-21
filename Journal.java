package library;

public class Journal extends Publication{
    protected int issueNumber;
    protected int year;
    public Journal(String title, String publisher, int qty, int issueNumber, int year){
       super(title,publisher, qty);
        this.issueNumber = issueNumber;
        this.year = year;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public int getYear() {
        return year;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString (){
        return getNumOfPublication() + "-Jrnl   " + this.title + "(" + this.issueNumber + ")"
                + "\n" + "          published by " + getPublisher() + "(" + this.year + ")";
    }

    @Override
    public String type() {
        return "Journal";
    }
}
