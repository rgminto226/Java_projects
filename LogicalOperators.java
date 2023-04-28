import java.util.Scanner;


public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical operators = used to connect two or more expressions
		//
		//  && = (AND) both conditions must be true
		//  || = (OR) either condition must be true
		//  !  = (NOT) reverses boolean value of condition
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! press q or Q to quit");
		String response = scanner.next();
		
		
		
		if(response.equals("q") || response.equals("Q")) {
			
			System.out.println("You Quit the game");
		}
		
		else {
			
			System.out.println("You are still playing the game *ha ha ha* ");
		}
		
		scanner.close(); // Always good practice to close your scanner for more efficent code.
		
		//This Example shows values using NOT logical operator in the condition
		//
	    //if(!response.equals("q") && !response.equals("Q")) {
			
		//	System.out.println("You Quit the game");
		//}
		
		//else {
			
		//	System.out.println("You are still playing the game *ha ha ha* ");
		//}
		
		
		//******************************************************************//
		// Remove // to initialize code for testing
		//This example below shows a quick example of AND logic
	
		//int temp = 25;
		
		//if(temp>30) {
		//	System.out.println("it is hot outside");
			
			
		//}
		
		//else if (temp >=20 && temp<=30) {   // both conditions have to be true for AND logic
		//	System.out.println("it is warm outside");
		//}
		
		//else {
			
		//	System.out.println("it is cold outside");
		//}
		 
	}

}
