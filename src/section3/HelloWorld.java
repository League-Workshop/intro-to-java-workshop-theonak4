package section3;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(null, "How is your day?");
		JOptionPane.showMessageDialog(null, "Have a " + input + " day.");
		
	}
	
}
