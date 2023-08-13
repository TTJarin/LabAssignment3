package problem5_2;

import java.util.Scanner;

public class FloatingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if (number > 0){
            System.out.println("Positive Number");
        }
        else if (number < 0) {
            System.out.println("Negative Number");
            if (1 > Math.abs(number)){
                System.out.println("Small");
            }
            else if (Math.abs(number) > 1000000) {
                System.out.println("large");
            }
        }
        else {
            System.out.println("Zero");
        }
    }
}
