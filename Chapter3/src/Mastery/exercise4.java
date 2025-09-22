package Mastery;
import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your mass in kilograms: ");
        double mass = input.nextDouble();
        //Energy in Joules 
        double c = 3 * Math.pow(10, 8);
        double e = mass * Math.pow(c, 2);
        double joulesPerBulb = 360000;
        double numberOfBulbs = e/joulesPerBulb;
        String output1 = String.format("The energy produced in Joules is = %s", e);
        System.out.println(output1);
        
        String output2 = String.format("The number of 100-watt light bulbs powered = %s", numberOfBulbs);
        System.out.println(output2);
	}	
}
