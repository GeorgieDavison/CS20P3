package Mastery;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner georgie = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the number of copies you'd like printed:");
            String becky = georgie.nextLine();
            int foo;
            try {
                foo = Integer.parseInt(becky);
            } catch (Exception e) {
                System.out.println("That's not a number silly, we're looking for numbers ONLY.");
                continue;
            }
            double ppc;
            if (foo >= 0 && foo < 100) {
                ppc = 0.30;
            } else if (foo >= 100 && foo < 500) {
                ppc = 0.28;
            } else if (foo >= 500 && foo < 750) {
                ppc = 0.27;
            } else if (foo >= 750 && foo <= 1000) {
                ppc = 0.26;
            } else {
                ppc = 0.25;
            }
            System.out.println("Price per copy is; $" + ppc);
            System.out.println("Your total cost is; $" + (ppc * foo));
        }
    }
}
