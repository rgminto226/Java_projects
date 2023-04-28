import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		Random random = new Random(); //psuedo random integers
	
		int x = random.nextInt(6)+1;  // you can set a value for how many numbers but remember computers count start at 0 so add 1 to initailization to do 1 - 6.
		System.out.println(x);
		
		double y = random.nextDouble();  // Ex. 2 using a double Datatype
		 System.out.println(y); 
		 
		boolean z = random.nextBoolean();// Ex. 3 using a Boolean Datatype
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//another thing you can do is generate strings with numbers like a lincense plate number
		/* String myString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		 * Use the random class to create random integers
		 * randomNum = random.nextInt(10)
		 * randomLetter = random.nextInt(26)+10
		 * 
		 *Then use the 
		 *myString.charAt(randomNum) method to pick a random number from the string
		 *myString.charAt(randomLetter) method to pick a random letter from the string
		 * 			Try to do this below 
		 */




	}

}
