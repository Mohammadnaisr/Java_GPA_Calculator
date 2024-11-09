public class Main  {
    public static void main(String[] args) {

        double score = 85.0;


        double gpa = (score >= 80 && score <= 100) ? 4.0 :
                (score >= 70 && score < 80) ? 3.75 :
                        (score >= 60 && score < 70) ? 3.5 :
                                (score >= 50 && score < 60) ? 3.25 :
                                        (score >= 40 && score < 50) ? 3.0 :
                                                (score >= 33 && score < 40) ? 2.0 : 0.0;


        System.out.println("Your GPA is: " + gpa);
    }
}
