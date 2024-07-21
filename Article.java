package library;

import java.util.Objects;

public class Article extends Journal {
    protected String title;
    protected String articleName;
    protected Author author;
    protected String URL;

public Article (String title, String publisher, int qty, int issueNumber, int year, String articleName, Author author, String URL ){
    super(title, publisher, qty, issueNumber, year);
    this.title = title;
    this.articleName = articleName;
    this.author = author;
    this.URL = URL;
    }
    @Override
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }

    public String getURL() {
        return URL;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String toString(){
        return getNumOfPublication() + "-Artl   " + this.articleName + ", by " + this.author.name + " at " + this.author.mail
                + "\n          " + this.title + "(" + this.issueNumber + ")"
                + "\n          " + "published by " + this.publisher + "(" + this.year + ")"
                + "\n          " + this.URL ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Article article = (Article) o;
        return Objects.equals(title, article.title) && Objects.equals(author, article.author) && Objects.equals(URL, article.URL);
    }
    public String type(){
    return "Article";
    }

}
