package main;

import javax.swing.JOptionPane;

public class votingboth {public static void main(String[] args) {
	String age = JOptionPane.showInputDialog(null,"How old are you?");
	int name = Integer.parseInt(age);
	if (name>(18)){
		JOptionPane.showInputDialog(null, "Which should be the nexted president. ");
	}
	else{
		JOptionPane.showMessageDialog(null, "No one cares what you think!");
	}
}

}
