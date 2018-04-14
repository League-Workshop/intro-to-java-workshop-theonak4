package section2;

import java.awt.Color; 
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot tbot = new Robot();
		tbot.setSpeed(900);
		
		tbot.penDown();
		
	
		while(true){
		   tbot.setPenColor(Color.RED);
		   tbot.move(20);
		   tbot.turn(10);
		   tbot.turn(14);
		}
		
	}
}
