package main;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String hight = JOptionPane.showInputDialog(null, "how tall are you.");
		int h = Integer.parseInt(hight);
		if (h > 4) {
			JOptionPane.showMessageDialog(null,
					"You are able to go on the rollercoaster.");

		} else {
			JOptionPane.showMessageDialog(null,
					"Listen to your parents for what you should eat.");
		}
	}
}
