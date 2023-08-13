package problem5_3;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number < 0){
            number = number * (-1);
        }
        int count = 0;
        int reminder;
        while (number != 0){
            reminder = number % 10;
            count = count + 1;
            number = number / 10;
        }
        System.out.println(count);

    }
}
