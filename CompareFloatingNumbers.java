package problem5_19;

import java.util.Scanner;

public class CompareFloatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        boolean areEqual = areEqualUpToTwoDecimalPlaces(number1, number2);

        if (areEqual) {
            System.out.println("The numbers are the same up to two decimal places.");
        }
        else {
            System.out.println("The numbers are not the same up to two decimal places.");
        }
    }
    public static boolean areEqualUpToTwoDecimalPlaces(float number1, float number2) {

        int num1 = (int) (number1 * 100);
        int num2 = (int) (number2 * 100);


        return num1 == num2;
    }
}
