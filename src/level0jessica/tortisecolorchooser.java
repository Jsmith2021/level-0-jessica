package level0jessica;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class tortisecolorchooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color do you want the tortoise to draw?");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		for (int i = 0; i < 1; i++) {
			if (color.equals("red")) {
				Tortoise.setPenColor(Color.RED);
			}
			else if (color.equals("orange")) {
				Tortoise.setPenColor(Color.ORANGE);
			}
			else if (color.equals("yellow")) {
				Tortoise.setPenColor(Color.YELLOW);
			}
			else if (color.equals("green")) {
				Tortoise.setPenColor(Color.GREEN);
			}
			else if (color.equals("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			}
			else if (color.equals("purple")) {
				Tortoise.setPenColor(Color.MAGENTA);
			}
			else if (color.equals("pink")) {
				Tortoise.setPenColor(Color.PINK);
			}
			else if (color.equals("black")) {
				Tortoise.setPenColor(Color.BLACK);
			}
			else if (color.equals("white")) {
				Tortoise.setPenColor(Color.WHITE);
			}
			
			// 5. if the user doesn’t enter anything, choose a random color
			else  {
				Tortoise.setPenColor(PenColors.getRandomColor());
			}
			// 6. put a loop around your code so that you keep asking the user
			// for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line of code)

			Tortoise.penDown();
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}
}
