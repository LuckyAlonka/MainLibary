package library;

import java.util.Objects;

public class Author {
    public String name;
    protected String mail;
    public Author(String name, String mail){
        this.name=name;
        this.mail=mail;
    }
    public String getName(){
        return name;
    }
    public String getMail(){
        return mail;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setMail (String mail){
        this.mail = mail;
    }

    public String toString(){
        return this.name + "at" + this.mail;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(mail, author.mail);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, mail);
//    }
}
