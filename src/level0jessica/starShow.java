package level0jessica;




	import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Tortoise;

	public class starShow {
	    
	    Robot robot = new Robot("batman");
	    
	    void makeStars() {
	        
	        //drawStar(150);    //5. delete this line. you will draw the star again in step 8.
	        // 13. Set the speed to 8
robot.setSpeed(8);

	        // 6. Make a variable to hold the X position of the Robot and set it to 10
int robotLocationX = 10;


	        // 7. Make a variable to hold the Y position of the Robot and set it to 950
int robotLocationY = 950;

	        // 8. Make a variable to hold the star size and set it to 25
int starsize=25;

	        // 12. Repeat the steps #19 to #18, 30 times
for (int i = 1; i < 31; i++){

	            // 19. Set the pen width to i 
	    robot.setPenWidth(i);
	            // 10. Set the X position of the robot to your X variable
	    robot.setX(robotLocationX);
	            // 11. Set the Y position of the robot to your Y variable
	    robot.setY(robotLocationY);
	            // 9. Call the drawStar() method with your star size variable
	    drawStar(starsize);
	   
	            // 14. Increase the X position by star size. See Figure 2.
	    robotLocationX += starsize;
	            // 15. decrease the Y position by star size. See Figure 3.
	    robotLocationY-=starsize;
	            // 16. Increase the star size by 20
	    starsize=starsize+20;
	            // 17. Turn the robot 12 degrees
	    robot.turn(12);
	            // 18. Make each star a different random color like in Figure 4. 
robot.setRandomPenColor();
}
	    }


	    private void drawStar(int starSize) {
	        // 2. Put the robot's pen down
robot.penDown();

	        // 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
for (int i = 1; i < 6; i++){

	            // 1. Move the robot the distance of the starSize variable
	    robot.move(starSize);
	            // 3. Turn the robot 144 degrees
	            robot.turn(144);
	    }
	    }
	    public static void main(String[] args) {
	        new starShow().makeStars();
	    }
	}

