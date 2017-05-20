package level0jessica;

import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
			System.out.println();
			String ans = JOptionPane.showInputDialog("how old are you?");
			int age = Integer.parseUnsignedInt(ans);

		}
	}

}
