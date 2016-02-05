package main;

import javax.swing.JOptionPane;

public class cool {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String riddle = JOptionPane
				.showInputDialog("What comes down but never goes up?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (riddle.equals("rain")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "rain");
		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String riddle2 = JOptionPane
				.showInputDialog("What can you catch but not throw?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (riddle.equals("cold")) {
			score++;
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "cold");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}
