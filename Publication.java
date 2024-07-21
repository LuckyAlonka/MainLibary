package library;

import java.util.Objects;

//Assignment : 2
//Author : Alona Yael Shalmiev
//ID: 332736842
public class Publication {
    protected String title;
    protected String publisher;
    protected   int qty;
    protected final int numOfPublication;
    protected static int pubCounter =10;


    public Publication(String title, String publisher, int gty){
        this.title = title;
        this.publisher = publisher;
        this.qty = qty;
        this.numOfPublication = pubCounter;
        pubCounter++;

    }

    public String getTitle (){
        return title;
    }

    public String getPublisher (){
        return publisher;
    }

    public int getQty (){
        return qty;
    }

    public int getNumOfPublication (){
        return numOfPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublication(String publisher) {
        this.publisher = publisher;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public static void setPubCounter(int pubCounter) {
        Publication.pubCounter = pubCounter;
    }

    public String toString () {
        return numOfPublication + "-" + "Title: " + this.title + " published by " + this.publisher + ". qty" + this.qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return qty == that.qty && numOfPublication == that.numOfPublication && Objects.equals(title, that.title) && Objects.equals(publisher, that.publisher);
    }
    public String type(){
        return "Publication";
    }

}




