package SkillBuilders;

import java.util.Scanner;

public class hurricane {

	public static void main(String[] args) {
		Scanner georgie = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter the category of your hurricane:");
			String becky = georgie.nextLine();
			int foo;
			try{
				foo = Integer.parseInt(becky);
			} 
			catch (Exception e) {
				System.out.println("That's not a number silly, we're looking for numbers from 1-5 ONLY.");
				continue;
			}
			switch (foo) {
				case 1:
					System.out.println("Wind speeds of 74-95 mph or 64-82 kt or 119-153 km/hr"); 
					break;
				case 2:
					System.out.println("Wind speeds of 96-110 mph or 83-95 kt or 154-177 km/hr");
					break;
				case 3:
					System.out.println("Wind speeds of 111-130 mph or 96-113 kt or 178-209 km/hr");
					break;
				case 4:
					System.out.println("Wind speeds of 131-155 mph or 114-135 kt or 210-249 km/hr");
					break;
				case 5:
					System.out.println("Wind speeds of >155 mph or >135 kt or >249 km/hr");
					break;
				default:
					System.out.println("That's not right! Try again on a scale of 1-5.");
					break;
			}
		}
	}

}
