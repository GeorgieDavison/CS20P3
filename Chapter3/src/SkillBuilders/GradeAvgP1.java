package SkillBuilders;

import java.util.Scanner;

public class GradeAvgP1 {

    public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter grade 1:");
		double grade1 = input.nextDouble();
		
		System.out.print("Enter grade 2:");
		double grade2 = input.nextDouble();
		
		System.out.print("Enter grade 3:");
		double grade3 = input.nextDouble();
		
		System.out.print("Enter grade 4:");
		double grade4 = input.nextDouble();
		
		double average = (grade1 + grade2 + grade3 + grade4) / 4;
		
		System.out.printf("The average grade is: %.2f\n", average);
		
		input.close();
	}

}
