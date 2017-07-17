package level0jessica;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffitti {
	public static void main(String[] args) {
Robot jessica=new Robot();
jessica.setSpeed(20);
jessica.penDown();
jessica.move(200);
jessica.turn(90);
jessica.move(100);
jessica.turn(180);
jessica.move(200);
jessica.penUp();
jessica.turn(270);
jessica.move(200);
jessica.penDown();
jessica.move(50);
jessica.turn(180);
jessica.move(50);
jessica.turn(180);
jessica.move(90);
jessica.turn(270);
jessica.move(100);
jessica.turn(270);
jessica.move(90);

}
}