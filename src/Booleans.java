import javax.swing.JOptionPane;

public class Booleans {
public static void main(String[] args) {
	boolean canVote = false;
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageNum = Integer.parseInt(age);
	if (ageNum >= 18) {
		canVote = true;
	}
	else if (ageNum < 18) {
		canVote = false;
	}
	
	if (canVote == true) {
		JOptionPane.showMessageDialog(null, "You are old enough to vote!");
	}
	else if (canVote == false) {
		JOptionPane.showMessageDialog(null, "You are not old enough to vote yet.");
	}
}
}
