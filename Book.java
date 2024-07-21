package library;

public class Book extends Publication {

    private Author author;
    private String editor;
    private int year;
public Book (String title, String publisher, int qty, Author author, String editor, int year){
    super(title, publisher,qty);
    this.author = author;
    this.editor = editor;
    this.year = year;
}

    public Author getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return getNumOfPublication() + "-Book   " + "'" + getTitle() + "'" + " by " + author + "\n" +
                "          published by " + getPublisher() + " edited by " +
                this.editor + "(" + this.year + ")";
    }

    public String type(){
        return "Book";
    }
}
