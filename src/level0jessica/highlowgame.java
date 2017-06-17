package level0jessica;

import java.util.Random;

import javax.swing.JOptionPane;

//Copyright Wintriss Technical Schools 2013
public class highlowgame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;

		// 2. Print out the random variable above
		System.out.println();
		// 11. do the following 10 times
		for (int i = 1; i < 11; i--) {

			// 1. ask the user for a guess using a pop-up window, and save their response
			String ans = JOptionPane.showInputDialog("Type in a guess below");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int answer = (Integer.parseInt(ans));
			// 5. if the guess is correct
			if (random == answer) {

				// 6. win
				JOptionPane.showMessageDialog(null, "You won!");
			}
			// 7. if the guess is high
			// 8. tell them it's too high
			if (random < answer) {
				JOptionPane.showMessageDialog(null, "Your guess is too high.");
			}
			// 9. if the guess is low
			// 10. tell them it's too low
			if (random > answer) {
				JOptionPane.showMessageDialog(null, "Your guess is too low.");
				// 12. tell them they lose
				JOptionPane.showMessageDialog(null, "You lose!");
			}

		}
	}
}
