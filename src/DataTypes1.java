import javax.swing.JOptionPane;

public class DataTypes1 {
//	Write a program that asks the user a question. 
//	If their answer is correct, tell them it's correct and increase their score by one.
//	Tell the user their score at the end.

	// String tells you that it stores words
	// int tells you that it stores numbers

	public static void main(String[] args) {

		int score = 0;

		String colors = JOptionPane.showInputDialog("What do you call an animal that only eats plants?");
		if (colors.equals("an herbivore")) {
			score++;
		}

		String spring = JOptionPane.showInputDialog("What season comes before summer?");
		if (spring.equals("spring")) {
			score++;
		}

		JOptionPane.showMessageDialog(null, "Your final score is " + score);

	}
}
