package problem5_5;

import java.util.Scanner;

public class WordCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.length() % 2 == 0){
            String firstHalf = word.substring(0,(word.length()/2));
            String lastHalf = word.substring((word.length()/2),word.length());
            if (firstHalf.compareTo(lastHalf) ==0){
                System.out.println("first and second half are same");
            }
            else {
                System.out.println("first and second half are different");
            }
            //System.out.println(firstHalf + lastHalf);
        }
        else {
            String firstHalf = word.substring(0,(word.length()/2));
            String lastHalf = word.substring((word.length()/2) + 1,word.length());
            if (firstHalf.compareTo(lastHalf) ==0){
                System.out.println("first and second half are same");
            }
            else {
                System.out.println("first and second half are different");
            }
           // System.out.println(firstHalf + lastHalf);
        }
    }
}
