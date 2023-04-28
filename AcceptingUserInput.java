import java.util.Scanner;

public class AcceptingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program will show you how to accept user input
		
		Scanner scanner = new Scanner(System.in);
		
		//User question 1.
		System.out.println("What is your full name ? ");
		String name = scanner.nextLine();
		
		//User question 2.
		System.out.println("How old are you User? ");
		int age = scanner.nextInt(); //When using a number use scanner.nextInt which means the next integer the use inputs.
		scanner.nextLine(); //here we added this to clear our new line to continue asking our questions after nextInt has been used
		
		//User question 3.
		System.out.println("what is your favorite food user");
		String food = scanner.nextLine();
		
		
		//User answers to questions printed and displayed in console
		System.out.println("Hello "+ name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+ food);
		//make sure the data type the user inputs is correct
		
		scanner.close(); // Always good practice to close your scanner for more efficent code.
	}

}
