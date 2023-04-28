import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nested Loops in Java
		//Nested Loops = a Loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		
		//Example 1. Using nested loop to print a symbol using rows and columns.
		int rows;
		int columns;
		String symbol = "";
		
		
		System.out.println("Enter number of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter the symbol to use: ");
		symbol = scanner.next();
		
		for(int i =1;i<=rows;i++) {
			System.out.println();
			for(int j =1;j<=columns;j++) {
				System.out.print(symbol);
				
			}

		}
		
		scanner.close(); //Remember to use scanner close
		
		
		
		//Example 2. Java Nested loop for Days and Weeks
		System.out.println(); // print line to start next example on new line
		System.out.println(); // print line to start next example on new line
		System.out.println("Example 2: Below"); // print line to start next example on new line
		
		int weeks = 3;
	    int days = 7;
	
	    // outer loop prints weeks
	    for (int i = 1; i <= weeks; i++) {
	      System.out.println("Week: " + i);

	      // inner loop prints days
	      for (int j = 1; j <= days; j++) {
	        System.out.println("  Day: " + j);
	      }
	    }
		
		
	    //Example 3. Java for loop inside the while loop 
	    System.out.println(); // print line to start next example on new line
		System.out.println(); // print line to start next example on new line
		System.out.println("Example 3: Below"); // print line to start next example on new line
		
	    int weekss = 3;
	    int dayss = 7;
	    int i = 1;

	    // outer loop
	    while (i <= weekss) {
	      System.out.println("Week: " + i);

	      // inner loop
	      for (int j = 1; j <= dayss; j++) {
	        System.out.println("  Days: " + j);
	      }
	      i++;
	    }
		
		
		//Example 4. Java nested loops to create a pattern
	    System.out.println(); // print line to start next example on new line
		System.out.println(); // print line to start next example on new line
		System.out.println("Example 4: Below"); // print line to start next example on new line
		
	    int rowss = 5;

	    // outer loop
	    for (int a = 1; a <= rowss; a++) {

	      // inner loop to print the numbers
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println("");
	    }
		
		//Example 5. Break and continue inside Nested loops
	    System.out.println(); // print line to start next example on new line
		System.out.println(); // print line to start next example on new line
		System.out.println("Example 5: Below"); // print line to start next example on new line
	    

	    int weeksss = 3;
	    int daysss = 7;

	    // outer loop
	    for(int b = 1; b <= weeksss; b++) {
	      System.out.println("Week: " + i);

	      // inner loop
	      for(int j = 1; j <= daysss; j++) {
	        
	        // break inside the inner loop
	        if(i == 2) {     // When we use a break statement inside the inner loop, it terminates the inner loop but not the outer loop. For example,
	          break;
	        }
	        System.out.println("  Days: " + j);
	      }
	    }
		
	  //Example 6. Break and continue inside Nested loops
	    System.out.println(); // print line to start next example on new line
		System.out.println(); // print line to start next example on new line
		System.out.println("Example 6: Below"); // print line to start next example on new line
	
		int weekssss = 3;
	    int dayssss = 7;

	    // outer loop
	    for(int c = 1; c <= weekssss; c++) {
	      System.out.println("Week: " + i);

	      // inner loop
	      for(int j = 1; j <= dayssss; ++j) {
	        
	        // continue inside the inner loop
	        if(j % 2 != 0) {           //Here, the continue statement is executed when the value of j is odd. Hence, the program only prints those days that are even.
	        	continue;	           //We can see the continue statement has affected only the inner loop. The outer loop is working without any problem.
	        }
	        System.out.println("  Days: " + j);
	      }
	    }
		
		
		
	}

}
