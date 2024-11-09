
public class Main {
    public static void main(String[] args) {

        int marks = 40;

        if (marks >= 80) {
            System.out.println( "A+"); // A+ 4.00
        } else if (marks >= 75) {
            System.out.println("A"); // A 3.75
        } else if (marks >= 70) {
            System.out.println(" A-"); // A- 3.50
        } else if (marks >= 65) {
            System.out.println("B+"); // B+ 3.25
        } else if (marks >= 60) {
            System.out.println("B"); // B 3.00
        } else if (marks >= 50) {
            System.out.println("C+"); // C+ 2.50
        } else if (marks >= 40) {
            System.out.println("C"); // C 2.00
        } else if (marks >= 33) {
            System.out.println("D"); // D 1.00
        }
    }
}


