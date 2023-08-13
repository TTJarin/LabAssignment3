package problem5_1;

import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("Positive Number");
        }
        else if(number<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }
    }

}
