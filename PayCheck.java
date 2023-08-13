package problem5_22;

import java.util.Scanner;

public class PayCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.nextLine();
        double hourlyWage = scanner.nextDouble();
        double hoursWorked = scanner.nextDouble();

        double regularPay;
        double overtimePay = 0.0;


        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyWage;
        } else {
            regularPay = 40 * hourlyWage;
            overtimePay = (hoursWorked - 40) * hourlyWage * 1.5;
        }

        double totalPay = regularPay + overtimePay;

        System.out.println("Paycheck for " + employeeName);
        System.out.println("Regular hours: " + hoursWorked + " hours");
        if (hoursWorked > 40) {
            System.out.println("Overtime hours: " + (hoursWorked - 40) + " hours");
        }
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay: $" + totalPay);

    }


}
