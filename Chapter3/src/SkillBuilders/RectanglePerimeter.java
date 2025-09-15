package SkillBuilders;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) 
	{
		//Deceleration
		int width;
		int length;
		
		//Initialization
		//width = 4;
		//length= 13;
		 
		//Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //Get width from user
        System.out.print("Enter the width of the rectangle:");
        width = scanner.nextInt();
        
		System.out.println("width:" + width);
		 
		 //Get length from user
		 System.out.print("Enter the length of the rectangle:");
	     length = scanner.nextInt();
	        
		 System.out.println("length:" + length);
		 

	}

}
