package problem5_17;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter three numbers :");

        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();

        if(number1 < number2 && number2 > number3){
            System.out.println("the largest number is number " + number2);
        }
        else if(number1 < number3 && number2 < number3){
            System.out.println("the largest number is number " + number3);
        }
        else {
            System.out.println("the largest number is number " + number1);
        }
    }
}
