package library;



public class MainStudents {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0]=new Student("Albert Einstein");
        students[1]= new Student("Marie Curie");
        students[2]= new Student("Rosalind Franklin");
        students[3]= new Student("Stephen Hawking");
        listStudents(students);
    }
     public static void listStudents(Student[]students){
        for (int i=0; i<4; i++){
            System.out.println(students[i].toString());
        }
     }

}
