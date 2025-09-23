package Mastery;



import java.util.Scanner;



public class exercise7 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        

        System.out.print("Enter an integer: ");

        int firstInteger = input.nextInt();

        System.out.print("Enter a second integer: ");

        int secondInteger = input.nextInt();

        input.close();

        

        System.out.println();

        

        System.out.println(String.format(

        		"%s / %s = %s",

        		firstInteger,

        		secondInteger,

        		firstInteger / secondInteger

    		));

        System.out.println(String.format(

        		"%s %% %s = %s",

        		firstInteger,

        		secondInteger,

        		firstInteger % secondInteger 

        		));

        

        System.out.println();

        

        System.out.println(String.format(

        		"%s / %s = %s",

        		secondInteger,

        		firstInteger,

        		secondInteger / firstInteger

    		));

        System.out.println(String.format(

        		"%s %% %s = %s",

        		secondInteger,

        		firstInteger,

        		secondInteger % firstInteger 

        		));

	}
}

