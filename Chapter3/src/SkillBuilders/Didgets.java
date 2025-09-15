package SkillBuilders;

import java.util.Scanner;

public class Didgets {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	 
    	System.out.print("Enter a two-digit number: ");
    	int number = scanner.nextInt();
    	
    	//Get tens place number
    	int tens = number/10;
    	
    	//Get ones place digit
    	int ones = number%10;
    	
    	System.out.println("Tens place digit:" + tens);
        System.out.println("Ones place digit: " + ones);

        scanner.close();
    }
}
