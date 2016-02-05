package main;

import javax.swing.JOptionPane;


	public class sleapyHead {

		public static void main(String[] args) {
			
			boolean isWeekday, isVacation;
			
			
			 // Ask the user for these values using
			
			//1 = no
			int i= JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
					 JOptionPane.YES_NO_OPTION);
if (i==(1)){
	JOptionPane.showMessageDialog(null,"sleep in");
}
else{
	JOptionPane.showMessageDialog(null, "get up lazybones!");
}
		

			/*
			 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
			 * print “get up lazybones!” If it is a weekday, and we are on vacation,
			 * print “sleep in”.
			 */
		}
	}




