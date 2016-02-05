package main;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bannaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String no = JOptionPane.showInputDialog(null, "Do you like bannanas?");

		// 2. if they say no,
		// tell them they are crazy
		// and end quiz
		if (no.equalsIgnoreCase("no")) {
			JOptionPane
					.showMessageDialog(
							null,
							"You are a minion hater and you don't show respect.In conclution you are crazy!");
		}
		// 3. if they say yes
		if (no.equalsIgnoreCase("yes")) {
			String j = JOptionPane.showInputDialog(null,
					"What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, j
					+ " is much better with bannanas!");
		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"
		
	}

}
