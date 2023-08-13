package problem5_10;

import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int count = 0;
        if (number1 == number2 || number1 == number3 || number1 == number4){
            count = count + 1;
        }
        if (number2 == number1 || number2 == number3 || number2 == number4){
            count = count + 1;
        }
        if (number3 == number1 || number3 == number2 || number3 == number4){
            count = count + 1;
        }
        if (number4 == number1 || number4 == number2 || number4 == number3){
            count = count + 1;
        }

        if (count == 4){
            System.out.println("Two pairs");
        }
        else {
            System.out.println("not two pairs");
        }
    }
}
