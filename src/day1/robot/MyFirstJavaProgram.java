package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Ultron = new Robot();
	
	Ultron.setSpeed(10);
	Ultron.penDown();
	Ultron.setPenColor(0,255,255);
	for (int i = 0; i < 4; i++) {
		Ultron.move(40);
		Ultron.turn(90);	
		Ultron.move(90);
		Ultron.move(90);
		Ultron.turn(90);
		Ultron.move(180);
		Ultron.turn(90);
		Ultron.move(180);
		Ultron.turn(90);
		Ultron.move(280);		
	}
	

	}
}
