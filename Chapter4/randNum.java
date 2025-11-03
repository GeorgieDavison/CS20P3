package SkillBuilders;

import java.util.Random;
import java.util.Scanner;

public class randNum {

	public static void main(String[] args) {
		Scanner georgie = new Scanner(System.in);
		while (true) {
			Random dad = new Random();
			int lowNum;
			int highNum;
			try {
				System.out.println("Please enter your first & lower integer:");
				lowNum = Integer.parseInt(georgie.nextLine());

				System.out.println("Please enter your second & higher integer:");
				highNum = Integer.parseInt(georgie.nextLine());

			}

			catch (Exception e) {
				System.out.println("That's not a number silly, we're looking for numbers ONLY.");
				continue;

			}
			if (highNum - lowNum <=0) {
				System.out.println("Hey! That doesn't work, lets try again.");
				continue;
			}
			int oma = dad.nextInt(highNum - lowNum) + lowNum;
			System.out.println("Your random number is:" + oma);

		}
	}
}