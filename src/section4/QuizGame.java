package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String president = JOptionPane.showInputDialog("Who was the first president of the US?");
		
		// 3.  Use an if statement to check if their answer is correct
		// 4.  if the user's answer was correct, add one to their score 
		if (president.equalsIgnoreCase("George Washington")) {
			score++;
		}
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String moon = JOptionPane.showInputDialog("Who was the first person to land on the moon?");
		if (moon.equalsIgnoreCase("Neil Armstrong")) {
			score++;
		}
		
		String painting = JOptionPane.showInputDialog("Which famous artist created the Mona Lisa?");
		if (painting.equalsIgnoreCase("Leonardo DaVinci")) {
			score++;
		}
		
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your final score is " + score);
	}
}
