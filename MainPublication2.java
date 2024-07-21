package library;




public class MainPublication2 {


    public static void main(String[] args) {

        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

        publications[0] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.",
                2, authors[0], "Tay Hohoff", 1960);
        publications[1] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020,
                "Yanshuf Aezim", authors[5],
                "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
        publications[4] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021,
                "Alufot Eropa le-Mathematica", authors[4],
                "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
        publications[6] = new Book("The Great Gatsby", "Charles Scribner's Sons",
                1, authors[1], "Maxwell Perkins", 1925);
        publications[7] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[8] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt",
                1, authors[2], "", 2002);
        publications[10] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022,
                "AI (artificial intelligence) is upgrading", authors[3],
                "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
        publications[12] = new Journal("Nature", "Springer Nature",
                5, 590, 2021);

        System.out.println("List of publication in the order they were entered: ");
        System.out.println("==================================================================\n");
        for (int i = 0; i < 13; i++) {
            System.out.println(publications[i].toString());
        }

        System.out.println("List of publication sorted by 'book', 'journal', 'article', 'encyclopedia': ");
        System.out.println("==============================================================");
        for (int i = 0; i < 13; i++) {
            sortPublicationArray(publications);
            System.out.println(publications[i].toString());
        }


    }

    public static void sortPublicationArray(Publication[] arr){
        Publication [] sortedArr = new Publication[arr.length];
        int i=0;

        // sort books
        for( Publication publication: arr){
            if ( publication instanceof Book){
                sortedArr[i++] = publication;
            }
        }

        // sort journal
        for (Publication publication: arr){
            if (publication instanceof Journal && !(publication instanceof Article)){
                sortedArr[i++] = publication;
            }
        }

        // sort article

        for (Publication publication:arr){
            if (publication instanceof Article){
                sortedArr[i++] = publication;
            }
        }

        // sort Encyclopedia

        for (Publication publication: arr){
            if (publication instanceof Encyclopedia){
                sortedArr[i++] = publication;
            }
        }
        // Sort other Publications
        for (Publication publication : arr) {
            if (!(publication instanceof Book) && !(publication instanceof Journal) && !(publication instanceof Encyclopedia)) {
                sortedArr[i++] = publication;
            }
        }
        // Ensure no null values in sortedArr
        for (int j = i; j < sortedArr.length; j++) {
            sortedArr[j] = null;
        }
        System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    }
}