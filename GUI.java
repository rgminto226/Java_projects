import javax.swing.JOptionPane;



public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
		JOptionPane.showMessageDialog(null, "you are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height in cm"));
		JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");
		
		
	}

}
