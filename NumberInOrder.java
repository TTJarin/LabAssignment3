package problem5_9;

import java.util.Scanner;

public class NumberInOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number2 >= number1){
            if (number3 >= number2){
                System.out.println("In oder");
            }
            else {
                System.out.println("Not in order");
            }
        }
        else {
            if (number3 <= number2){
                System.out.println("In oder");
            }
            else {
                System.out.println("Not in order");
            }
        }

    }
}
