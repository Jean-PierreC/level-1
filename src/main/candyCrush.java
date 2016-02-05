package main;


import javax.swing.JOptionPane;

public class candyCrush {//Copyright Wintriss Technical Schools 2014
	

	 

		public static void main(String[] args) {
			// 1. Using a pop-up, ask the user who they don't like
String bad =JOptionPane.showInputDialog("Who do you not like?");
			// 2. Change the next line so that the pop-up will tell them they have a crush on that person
			JOptionPane.showMessageDialog(null, "You totally have a crush on "+ ( bad)+"!");
			// 3. Ask the user for the name of their best friend
String good= JOptionPane.showInputDialog("Who is your best friend?");
			// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null, "Your friend "+ ( good)+" is as sweet as candy, litterlly!");
		} 
	}






