package main;

import javax.swing.JOptionPane;


public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String j =JOptionPane.showInputDialog("Do you know how to write code");
		// 2. If they say "yes", tell them they will rule the world.
if (j.equalsIgnoreCase("yes")){
	JOptionPane.showMessageDialog(null, "You will rule the world.");
}
		// 3. Otherwise, wish them good luck washing dishes.
else{
	JOptionPane.showMessageDialog(null, "Next time I will see you is when I order pizza.");
}
	}
}



