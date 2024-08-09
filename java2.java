import java.util.Scanner;

public class java2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your score: ");
            int score = scanner.nextInt();
            String grade;

            if (score >= 90) {
                grade = "A+";
                System.out.println("Your grade is: " + grade + " (Oh that's great!!!)");
            } else if (score >= 80) {
                grade = "A";
                System.out.println("Your grade is: " + grade + " (You're so cool!)");
            } else if (score >= 75) {
                grade = "B+";
                System.out.println("Your grade is: " + grade + " (Nice boi!)");
            } else if (score >= 70) {
                grade = "B";
                System.out.println("Your grade is: " + grade + " (Not so bad!)");
            } else if (score >= 65) {
                grade = "C+";
                System.out.println("Your grade is: " + grade + " (Yeah! cool!)");
            } else if (score >= 60) {
                grade = "C";
                System.out.println("Your grade is: " + grade + " (Nice!)");
            } else if (score >= 55) {
                grade = "D+";
                System.out.println("Your grade is: " + grade + " (Good)");
            } else if (score >= 50) {
                grade = "D";
                System.out.println("Your grade is: " + grade + " (Ooh...You can do it better!)");
            } else {
                grade = "F";
                System.out.println("Your grade is: " + grade + " (Oh.. what the fuck is that!)");
            }
        } while (true);

    }
}