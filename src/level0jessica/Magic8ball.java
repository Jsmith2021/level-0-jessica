package level0jessica;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8ball {
	public static void main(String[] args) {

		// 1. Make a main method that includes all the steps below….

		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"

		int random = new Random().nextInt(4);
		Random rand = new Random();

		// 3. Print out this variable
		System.out.println();
		// 4. Get the user to enter a question for the 8 ball
		String ans = JOptionPane.showInputDialog("Please put in a question for the magic 8 ball.");
		// 5. If the random number is 0
		if (random == 0) {
			JOptionPane.showMessageDialog(null, "Yes.");

		}

		// -- tell the user "Yes"

		// 6. If the random number is 1
		if (random == 1) {
			JOptionPane.showMessageDialog(null, "No.");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (random == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (random == 3) {
			JOptionPane.showMessageDialog(null, "Maybe.");
		}
		// -- write your own answer

	}

}
