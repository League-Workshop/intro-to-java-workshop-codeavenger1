import javax.swing.JOptionPane;

public class DataTypes1 {
//	Write a program that asks the user a question. 
//	If their answer is correct, increase their score by one.
//	Tell the user their score at the end.

	// String tells you that it stores words
	// int tells you that it stores numbers

	public static void main(String[] args) {
		int score = 0;
		
		String poem = JOptionPane.showInputDialog("Who wrote Romeo and Juliet?");
		if (poem.equals("Shakespeare")) {
			score+=1;
		}
		
		String season = JOptionPane.showInputDialog("What season comes before summer?");
		if (season.equals("spring")) {
			score++;
		}
		
		JOptionPane.showMessageDialog(null, "Your final score is " + score);
	}
}
