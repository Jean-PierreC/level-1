package main;

import javax.swing.JOptionPane;

public class quizbowl {public static void main(String[] args) {
	String one=JOptionPane.showInputDialog(null,"How old is Joon.");
	if (one.equals("37")){
		JOptionPane.showMessageDialog(null, "correct");
	}
	else {
	JOptionPane.showMessageDialog(null, "incorrect");
	}
	String two=JOptionPane.showInputDialog(null,"How old is America.end with your answer years old");
	if (two.equals("289 years old")){
		JOptionPane.showMessageDialog(null, "correct");
	}
	else {
	JOptionPane.showMessageDialog(null, "incorrect");
	}
	String three=JOptionPane.showInputDialog(null,"what is Aidan's favorite food ");
	if (three.equals("sushi")){
		JOptionPane.showMessageDialog(null, "correct");
	}
	else {
	JOptionPane.showMessageDialog(null, "incorrect");
	}
	
	
	
}

}
