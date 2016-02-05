package main;

// Copyright Wintriss Technical Schools 2013

import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class re {public static void main(String[] args) {
	 String fist=JOptionPane.showInputDialog(null, "What is your first name?");
	 String last=JOptionPane.showInputDialog(null, "What is your last name?");
	 String birth=JOptionPane.showInputDialog(null, "What is your date of birth?");
	 String travel=JOptionPane.showInputDialog(null, "Where are you going to vistit?");
	 String gender=JOptionPane.showInputDialog(null, "What is your your gender?");
	JOptionPane.showMessageDialog(null, "Your name is " + fist + " " + last + "You were born on " + birth + "You are visiting " + travel + "Your gender is " + gender + ".");
	
}}
