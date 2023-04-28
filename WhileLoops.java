import java.util.Scanner;


public class WhileLoops {

	

	 public static void main(String[] args) {
	  
	  // while loop = executes a block of code as long as a it's condition remains true
      // while loops save time, reduce errors and make code readable
		 
	  Scanner scanner = new Scanner(System.in);
	  String name = "";
	  
	//Example 1: while the user does not enter a name and leaves it blank print enter your name until then then print hello and the name entered 
	  
	  while(name.isBlank()) {				 //condition must be met
	   System.out.print("Enter your name: ");
	   name = scanner.nextLine();
	  }
	  
	  System.out.println("Hello "+name);
	   
	  scanner.close(); 						// Always good practice to close your scanner for more efficient code.
	
	  /// print new line in console after the first while loop
	  System.out.println();
	  
	  
	  //Example 2: below shows a while loop that increases as long as the condition of i<5 is true
	  
	  int i = 0;
		 while(i<5) {
			 System.out.println(i);
			 i++;							//Don't forget to increase variable in the condition otherwise loop will never end
		 }
		
	   // print new line in console after the second while loop
		  System.out.println();
		 
		 
	   //Example 3: do/while loop 
		 
		 int x = 0;
		 do {
			 System.out.println(x);
			 x++;
			 
		 } while (x<5); 					//Basically says do print x while x<5
		 
		 
		 
	 }
		 
}
	
	
	

