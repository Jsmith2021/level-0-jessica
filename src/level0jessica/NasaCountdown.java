package level0jessica;

import javax.swing.JOptionPane;

public class NasaCountdown {

	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String ans = JOptionPane.showInputDialog("When do you want to start?");
		// 3. convert the user's answer to an int (Integer.parseInt)
		int age = Integer.parseUnsignedInt(ans);

		// 4. countdown from user's starting point
		for (int i = age; i > 0; i--) {
			speak(i + "");
		}
		// 1. countdown from 10 to 0
		for (int i = 10; i < 0; i--) {

		}
		// 5. when the counting is done, print "blastoff!"
		JOptionPane.showInputDialog("Blast off!");
		System.out.println();

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
