package library;
import java.util.Scanner;
public class MainLibary {

    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0]=new Student("Albert Einstein");
        students[1]= new Student("Marie Curie");
        students[2]= new Student("Rosalind Franklin");
        students[3]= new Student("Stephen Hawking");



        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee","harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald","scott@somwhere.com");
        authors[2] = new Author("Amos Oz","oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron","giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud","avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad","ezra@somwhere.com");

        publications[0]= new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                2, authors[0],"Tay Hohoff", 1960);
        publications[1]=new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[2]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",1);
        publications[3]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",3);
        publications[4]=new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1],"Maxwell Perkins", 1925);
        publications[5]=new Journal("Teva Hadvarim","Hahevra le-Heker Haadam ve-Hasovev ltd",5,297,2020);
        publications[6]=new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[7]=new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2],"", 2002);
        publications[8]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",2);
        publications[9]=new Journal("Nature","Springer Nature",
                5,  590,2021 );
        loanPub(publications, students);
    }

    public static void loanPub(Publication[]publications, Student[]students) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\nWelcome to the library. Start loan:");
            System.out.println("insert student number [0,3]: ");
            int studentNum = scan.nextInt();

            if (studentNum == -1) {
                flag = false;
                continue;}

            System.out.println("insert publication number[10,22]: ");
            int publicationNum = scan.nextInt();
            if (publications[publicationNum - 10].qty > 0 && students[studentNum].loanedNum < 3) {
                publications[publicationNum - 10].qty--;
                students[studentNum].loanedArray(publications[publicationNum - 10]);

                System.out.println("Loan Report: ");
                System.out.println(students[studentNum].toString());
                System.out.println("List of loaned publications:");
                for (int i = 0; i < students[studentNum].loanedNum; i++) {
                    System.out.println(students[studentNum].loanedPublications[i]);
                }

                System.out.println("Successful loan of: ");
                System.out.println(publications[publicationNum - 10].getNumOfPublication() + "-" + publications[publicationNum - 10].type() + "\t\t" + "qty:" + publications[publicationNum - 10].qty + "'" + publications[publicationNum - 10].title + "'");
            } else if (publications[publicationNum - 10].qty == 0) {
                System.out.println("Load report: Loan failed - out of stock. ");
                System.out.print(publications[publicationNum-10].getNumOfPublication() + "-" + publications[publicationNum-10].type() + "\t\t" + "qty:" + publications[publicationNum-10].qty + "'" + publications[publicationNum-10].title + "'");
            } else if (students[studentNum].loanedNum == 3) {
                System.out.println("Load report: Loan failed - student has already loaned 3 publications. ");
                System.out.println(students[studentNum].toString());
                System.out.println("List of loaned publication: ");
                for (int i = 0; i < 3; i++) {
                    System.out.println(students[studentNum].loanedPublications[i]);
                }
            }
        }

        // Display library status report
        System.out.println("Report on library status:");
        System.out.println("=============================================================");
        MainPublication2.sortPublicationArray(publications);
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] instanceof Encyclopedia) {
                System.out.println(publications[i].getNumOfPublication() + "-" + publications[i].type() +
                        "     qty: " + publications[i].qty + "  " + publications[i].title + " vol. " + ((Encyclopedia) publications[i]).getVolume());
            } else if (publications[i] instanceof Article) {
                System.out.println(publications[i].getNumOfPublication() + "-" + publications[i].type() +
                        "     qty: " + publications[i].qty + " '" + ((Article) publications[i]).articleName + "'");
            } else {
                System.out.println(publications[i].getNumOfPublication() + "-" + publications[i].type() +
                        "\t\tqty: " + publications[i].qty + " '" + publications[i].title + "'");
            }
        }
    }
}

