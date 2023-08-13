package problem5_8;

import java.util.Scanner;

public class StrictOrLanient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mode : ");
        String mode = scanner.nextLine().toLowerCase();

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        String order;
        if (mode.equals("strict")) {
            if (num1 < num2 && num2 < num3) {
                order = "increasing";
            }
            else if (num1 > num2 && num2 > num3) {
                order = "decreasing";
            }
            else {
                order = "neither";
            }
        } else if (mode.equals("lenient")) {
            if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
                order = "increasing and decreasing";
            }
            else if (num1 < num2 && num2 < num3) {
                order = "increasing";
            }
            else if (num1 > num2 && num2 > num3) {
                order = "decreasing";
            }
            else {
                order = "neither";
            }
        }
        else {
            order = "invalid mode";
        }
        System.out.println("The numbers are in " + order + " order.");
    }
}
