package SkillBuilders;

import java.util.Scanner;

public class delivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the width of you're package:");
            int width = Integer.parseInt(scanner.nextLine());

            if (width >= 10) {
                System.out.println("Reject.");
                continue;
            }
            System.out.println("Please enter the length of you're package:");
            int length = Integer.parseInt(scanner.nextLine());

            if (length >= 10) {
                System.out.println("Reject.");
                continue;
            }
            System.out.println("Please enter the height of you're package:");
            int height = Integer.parseInt(scanner.nextLine());

            if (height >= 10) {
                System.out.println("Reject.");
                continue;
            
            }

            System.out.println("Accept.");

        }

    }
}