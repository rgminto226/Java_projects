import java.util.Scanner;
public class Mathclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// This will find the max of 2 values
		double x = 3.14;
		double y = 10;
		 
		
		double z = Math.max(x, y); //This will find the Maximum (larger value)
		System.out.println(z);
		
		//This will find the Minimum and print it for the variables x,y
		System.out.println(Math.min(x, y)); 
		
		// This will find the absolute value of y and print
		System.out.println(Math.abs(y));
		
		
		//This will display the sqrt function
		System.out.println(Math.sqrt(y));
		
		//This will display the round function
		System.out.println(Math.round(x));
		
		//This will round to the ceiling
		System.out.println(Math.ceil(x));
		
		//This will round to the floor
		System.out.println(Math.floor(x));

		// Lets create a problem 
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a:");
		a = scanner.nextDouble();
		
		System.out.println("Enter side b:");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("The Hypotenuse is : "+ c);
		
		
		scanner.close(); // Always good practice to close your scanner for more efficent code.
		
		
		//Remember you can create a GUI for the user if you want by importing joptionpane and show message dialogs.
		
		
	}

}
