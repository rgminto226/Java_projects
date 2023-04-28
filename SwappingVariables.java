
public class SwappingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x = "water";
		String y = "kool Aid";
		String temp;
		
		System.out.println("X: "+ x);
		System.out.println("Y: "+ y);	
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("X: "+ x);
		System.out.println("Y: "+ y);
		
	}

}
