package SkillBuilders;

import java.util.Scanner;

public class perfectSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter your integer:");
			int num = Integer.parseInt(scanner.nextLine());
			double root = Math.sqrt(num);
			int trun = (int) root;
			int sqtrun = trun * trun;
			if (num == sqtrun) {
				System.out.println("That's a perfect square!");
			} else {
				System.out.println("Sorry, but that's not a perfect square :(");
			}
			continue;
		}

	}
}
