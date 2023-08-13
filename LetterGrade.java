package problem5_13;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letterGrade = scanner.nextLine().toUpperCase();

        double numericValue = getNumericGrade(letterGrade);

        System.out.println(numericValue);


    }

    public static double getNumericGrade(String letterGrade){
            switch (letterGrade) {
                case "A":
                    return 4.0;
                case "A+":
                    return 4.0;
                case "A-":
                    return 3.7;
                case "B":
                    return 3.0;
                case "B+":
                    return 3.3;
                case "B-":
                    return 2.7;
                case "C":
                    return 2.0;
                case "C+":
                    return 2.3;
                case "C-":
                    return 1.7;
                case "D":
                    return 1.0;
                case "D+":
                    return 1.3;
                case "D-":
                    return 0.7;
                case "F":
                    return 0.0;
                default:
                    System.out.println("Invalid letter grade.");
                    return -1.0;
            }
    }
}
