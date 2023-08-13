package problem5_18;

import java.util.Scanner;
import java.util.Arrays;

public class LexicographicSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three strings : ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String strings[] = {str1, str2, str3};
        Arrays.sort(strings);

        System.out.println("The sorted strings are:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
