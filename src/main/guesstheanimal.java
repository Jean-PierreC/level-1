package main;

import javax.swing.JOptionPane;

public class guesstheanimal {
	public static void main(String[] args)
	{for (int i = 0; i < 4; i++) {
		
	
		JOptionPane.showMessageDialog(null, "Choose snake, pig, monkey,cat ,or cow.");
		String answer= JOptionPane.showInputDialog(null,"Does it have legs?");
		if (answer.equalsIgnoreCase("no")){
			JOptionPane.showMessageDialog(null, "It is a snake");
		
		}
		
		else if (answer.equalsIgnoreCase("yes")){
			String answer2= JOptionPane.showInputDialog(null,"Does it like mud?");
			 
		 if (answer2.equalsIgnoreCase("yes")){
				
				
					JOptionPane.showMessageDialog(null, "It is a pig");
			}
		 else if(answer2.equalsIgnoreCase("no")){
			String answer3=JOptionPane.showInputDialog(null,"Does it say moooooooooooo");
			if (answer3.equalsIgnoreCase("yes")){
				JOptionPane.showMessageDialog(null, "It's a cow!Go mooooo");
			}
			
			else if (answer3.equalsIgnoreCase("no")){
	String ans3=	JOptionPane.showInputDialog(null,"Does it meeeooow?");
			if (ans3.equalsIgnoreCase("yes")){
				JOptionPane.showMessageDialog(null,"It's a cat.");
			
			}
			else{
				
			JOptionPane.showMessageDialog(null, "It's a monkey!");
			}
		}
		
	}

}
}
}
}