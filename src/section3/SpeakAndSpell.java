package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {
	
	public static void main(String[] args) {
		
		int score = 0;
		
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		
		// 2. Catch the user's answer in a String
		String mandlebrot = JOptionPane.showInputDialog("");
		
		// 3. If the user spelled the word correctly, speak "correct"
		if (mandlebrot.equalsIgnoreCase("mandlebrot")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score++;
		}
		
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null, "That's incorrect.");
		}
		
		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


