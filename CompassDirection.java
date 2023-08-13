package problem5_11;

import java.util.Scanner;

public class CompassDirection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle = scanner.nextInt();
        angle = ((angle % 360) + 360) % 360;

        String direction[] = {"N","NE","E","SE","S","SW","W","NW"};
        int directionAngle[] = {0,45,90,135,180,225,270,315};

        int nearestDirectionIndex = 0;
        int minDifference = Math.abs(angle - directionAngle[0]);

        for (int i = 1; i < directionAngle.length; i++) {
            int difference = Math.abs(angle - directionAngle[i]);
            if (difference < minDifference) {
                minDifference = difference;
                nearestDirectionIndex = i;
            }
        }
        System.out.println(direction[nearestDirectionIndex]);
    }
}
