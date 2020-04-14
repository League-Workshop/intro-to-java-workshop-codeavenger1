package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ironGiant = new Robot ();
	ironGiant.setSpeed(10);
	ironGiant.penDown();
	ironGiant.move(200);	
	ironGiant.turn(80);
	
	}
}
