import javax.swing.JOptionPane;

public class DataTypes3 {
	public static void main(String[] args) {
// Write a program that asks the user if they are a girl and if they have brown eyes.
// Depending on the user's answer, use a pop up to tell them what they chose. 

		// Boolean tells you that it stores true or false

		boolean isGirl = false;
		boolean hasBrownEyes = false;

		String girl = JOptionPane.showInputDialog("Are you a girl?");
		if (girl.equals("yes")) {
			isGirl = true;
		} else if (girl.equals("no")) {
			isGirl = false;
		}

		String eyes = JOptionPane.showInputDialog("Do you have brown eyes?");
		if (eyes.equals("yes")) {
			hasBrownEyes = true;
		} else if (eyes.equals("no")) {
			hasBrownEyes = false;
		}

		if (isGirl == true && hasBrownEyes == true) {
			
			JOptionPane.showMessageDialog(null, "You are a girl and have brown eyes.");
			
		} else if (isGirl == true && hasBrownEyes == false) {
			
			JOptionPane.showMessageDialog(null, "You are a girl and do not have brown eyes.");
			
		} else if (isGirl == false && hasBrownEyes == true) {
			
			JOptionPane.showMessageDialog(null, "You are not a girl and have brown eyes.");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "You are not a girl and do not have brown eyes.");
			
		}
	}
}
