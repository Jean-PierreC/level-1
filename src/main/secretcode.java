package main;

import javax.swing.JOptionPane;

public class secretcode {
	public static void main(String[] args) {
		int code = 31;
		String m = JOptionPane.showInputDialog("Type a secret message");
		String pass = JOptionPane.showInputDialog(null,
				"Ask your friend for the passcode and put it in the box.");
		while (!pass.equalsIgnoreCase("31")) {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!");
			pass = JOptionPane.showInputDialog(null,
					"Ask your friend for the passcode and put it in the box.");
		}

		JOptionPane.showMessageDialog(null, m);

	}
}
