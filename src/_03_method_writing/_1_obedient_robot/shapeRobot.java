package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class shapeRobot {
	public static void main(String[] args) {
		

		
squaremethod();
Robot rob = new Robot();
int n = 0;
rob.hide();
rob.penDown();
rob.setSpeed(50);
while(n<4) {
rob.move(90);
rob.turn(90);
n++;}

		
trianglemethod();
int t = 0;
rob.penDown();
rob.setSpeed(50);
while(t<3) {
rob.turn(120);
rob.move(120);
t++;
}

circlemethod();
int c = 0;
while(c<360) {
	rob.move(1);
	rob.turn(1);
	c++;
}

String shape = JOptionPane.showInputDialog("Do you want to draw a square, a triangle, or a circle");
	
if(shape.equalsIgnoreCase("square")) {
	squaremethod();
}
else if(shape.equalsIgnoreCase("triangle")){
	trianglemethod();
}
else if(shape.equalsIgnoreCase("circle")) {
	circlemethod();
}








}

	
		
	

	private static void circlemethod() {
		// TODO Auto-generated method stub
		
	}

	private static void trianglemethod() {
		
		
	}

	private static void squaremethod() {
	
		
	}}
