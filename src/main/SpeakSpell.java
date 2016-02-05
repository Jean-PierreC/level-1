package main;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakSpell {

	public static void main(String[] args) {

		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		int score = 0;
		JOptionPane.showMessageDialog(null, "each question is worth 25 Points.");
		speak("spell Ventriloquism");

		// 2. Catch the user's answer in a String
		String speak = JOptionPane.showInputDialog("Spell the mentioned word");
		// 3. If the user spelled the word correctly, speak "correct"
		if (speak.equalsIgnoreCase("Ventriloquism")) {
			speak("awesome bro you got it correct");
			score+=(25);
		}
		// 4. Otherwise say "wrong"
		else {
			speak("Who taught you english");
		}
		// 5. repeat the process for other words
		speak("spell sasquatch");

		// 2. Catch the user's answer in a String
		String speak2 = JOptionPane.showInputDialog("Spell the mentioned word");
		// 3. If the user spelled the word correctly, speak "correct"
		if (speak2.equalsIgnoreCase("sasquatch")) {
			speak("awesome bro you got it correct");
			score+=(25);
		}
		// 4. Otherwise say "wrong"
		else {
			speak("Who taught you english");
		}
		speak("spell Anna is going to turn pink when she is about to pass.");

		// 2. Catch the user's answer in a String
		String speak3 = JOptionPane.showInputDialog("Spell the mentioned word");
		// 3. If the user spelled the word correctly, speak "correct"
		if (speak3.equalsIgnoreCase("Anna is going to turn pink when she is about to pass")) {
			speak("awesome bro you got it correct");
			score+=(25);
		}
		// 4. Otherwise say "wrong"
		else {
			speak("Who taught you english");
		}
		JOptionPane.showMessageDialog(null, score+" points out of 75");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
