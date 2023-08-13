package problem5_21;

import java.util.Scanner;

public class NumberOfDaysInAmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month : ");
        int month = scanner.nextInt();
        int days;
        switch (month) {
            case 2:
                days = 28;
                System.out.println("February has " + days + " days.");
                break;
            case 4:
                days = 30;
                System.out.println("Month " + month + " has " + days + " days.");
                break;
            case 6:
                days = 30;
                System.out.println("Month " + month + " has " + days + " days.");
                break;
            case 9:
                days = 30;
                System.out.println("Month " + month + " has " + days + " days.");
                break;
            case 11:
                days = 30;
                System.out.println("Month " + month + " has " + days + " days.");
                break;
            default:
                days = 31;
                System.out.println("Month " + month + " has " + days + " days.");
        }

    }
}
