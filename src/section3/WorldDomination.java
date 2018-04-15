package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		int question = JOptionPane.showConfirmDialog(null, "Do you know how to write code");
		// 2. If they say "yes", tell them they will rule the world.
        if(question == 0) { // User says yes
        	   JOptionPane.showMessageDialog(null, "You will rule the world!");
        	   
        } else {
        	   JOptionPane.showMessageDialog(null, "Good luck doing the dishes.");
        }
        	
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

