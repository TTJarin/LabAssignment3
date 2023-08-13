package problem5_7;

import java.util.Scanner;

public class IncreasingOrderNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number2 > number1){
            if (number3 > number2){
                System.out.println("inceasing");
            }
            else {
                System.out.println("neither");
            }
        }
        else {
            if (number3 < number2){
                System.out.println("deceasing");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
