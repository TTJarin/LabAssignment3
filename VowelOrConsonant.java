package problem5_20;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toLowerCase();

        if(input.length() > 1){
            System.out.println("please enter a single character");
        }
        else {
            char character = input.charAt(0);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' ||
                    character == 'u' ){
                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }
        }
    }
}
