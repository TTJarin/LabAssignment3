package problem5_4;

import javax.management.StringValueExp;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //char firstLetter = name.charAt(0);
        //char laststLetter = name.charAt(name.length()-1);
        if ((name.charAt(0)) == (name.charAt(name.length()-1))){
            System.out.println("First and last letter are same");
        }
        else {
            System.out.println("First and last letter are different");
        }
    }
}
