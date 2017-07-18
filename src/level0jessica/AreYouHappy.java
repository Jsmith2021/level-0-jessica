package level0jessica;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happiness=JOptionPane.showInputDialog("Are you happy?");
		if(happiness.equals("yes")){
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
		}
		else{
			String happy=JOptionPane.showInputDialog("Do you want to be happy?");
			if(happy.equals("yes")){
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else{
				JOptionPane.showMessageDialog(null, "keep doing what you're doing.");
			}
		}
		
}
}