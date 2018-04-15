package section3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog(null, "What is your name?");
		
		
		if(JOptionPane.showConfirmDialog(null, "Is your name" + name + "?") == 0) {
			JOptionPane.showMessageDialog(null, "Hello " + name + "!");
		} else {
		    JOptionPane.showMessageDialog(null, "Goodbye");
		}
		
	}
	
}
