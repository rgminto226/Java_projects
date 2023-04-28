
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch = statement that allows a variable to be tested for equality against a list of values
		//Unlike if-then and if-then-else statements, the switch statement can hava a number of possible execution paths. A switch works with
		//byte, short, char and int primitive data types. it also works with enumberated types, the string class, and a few special classes that 
		//wrap certain primitive types characters byte, short and integers.
		  
		  String day = "Friday";
		  
		  switch(day) {
		   case "Sunday": System.out.println("It is Sunday!");
		   break;
		   case "Monday": System.out.println("It is Monday!");
		   break;
		   case "Tuesday": System.out.println("It is Tuesday!");
		   break;
		   case "Wednesday": System.out.println("It is Wednesday!");
		   break;
		   case "Thursday": System.out.println("It is Thursday!");
		   break;
		   case "Friday": System.out.println("It is Friday!");
		   break;
		   case "Saturday": System.out.println("It is Saturday!");
		   break;
		   default: System.out.println("That is not a day!"); // if there is no match
		  }
	}

}
