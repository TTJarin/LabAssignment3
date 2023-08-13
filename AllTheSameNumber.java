package problem5_6;

import java.util.Scanner;

public class AllTheSameNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if(number1 == number2 && number2 == number3){
            System.out.println("all the numbers are same.");
        }
        else{
            System.out.println("all the numbers are different");
        }
    }

}
