package main;

import javax.swing.JOptionPane;

public class adventure {public static void main(String[] args) {
	String f = JOptionPane.showInputDialog(null,"You are going on an adventure and you are taking a path and you either go right or left.Where will you go?");
	if (f.equalsIgnoreCase("right")){
		String s =JOptionPane.showInputDialog(null,"Now there is a bridge. Will you go through the bridge or under the bridge." );	
		if (s.equalsIgnoreCase("under")){
			String t =JOptionPane.showInputDialog(null,"Now  there is a couch and a bench which will you sit on." );
			if (t.equalsIgnoreCase("couch")){
				JOptionPane.showMessageDialog(null, "You died because a potcher thought you were a lazy rino siting on a couch.");
			}
			else {
			JOptionPane.showMessageDialog(null, "You get what ever you want from your grandma.");
			}
		}
		
		else if (s.equalsIgnoreCase("through")){
			JOptionPane.showMessageDialog(null, "The troll got you and now you have to rub its feet for a year.");
		}
	}
	else if (f.equalsIgnoreCase("left")) {
				String ff = JOptionPane.showInputDialog(null,
						"No there is a button one is green the other is blue.");
				if (ff.equalsIgnoreCase("blue")) {
					JOptionPane
							.showMessageDialog(null,
									"You get a big pot of gold and lemanade from Nick right now");
				} else {
					JOptionPane.showMessageDialog(null,
							"You get shoot from your mom and you died.");
				}

			}
	
	} 

}

