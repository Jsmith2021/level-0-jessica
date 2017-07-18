package level0jessica;

import javax.swing.JOptionPane;

public class summertime {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog(null, "Hi! What is your name?");
		String grade= JOptionPane.showInputDialog("What grade are you going into?");
		String summer= JOptionPane.showInputDialog("What are you doing this summer?");
		System.out.print("Hi, " + name + "you are going into " + grade + " in the fall. You are " + summer + " this summer. Good luck for school next year and have fun!");
		
}
}