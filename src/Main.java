import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the student's score: ");
                int score = scanner.nextInt();

                studentScore(score);
    }

    public static void studentScore(int score){
        char grade;

        if (score >= 0 && score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                     break;
                case 7:
                    grade = 'C';
                    break;

                case 6:
                    grade = 'D';
                    break;

                default:
                    grade = 'F';
                    break;

            }

            System.out.println("Letter grade: " + grade);

        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        }
    }

}






