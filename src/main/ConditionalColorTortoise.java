package main;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ConditionalColorTortoise {
	
	public static void main(String[] args) {
		Tortoise.setSpeed(5);
		Tortoise.setPenWidth(10);
		while (true){
			String color = JOptionPane.showInputDialog("What color would you like the tortoise to draw?").toLowerCase();
			if (color.equals("red")) {
				Tortoise.setPenColor(Color.RED);
			} else if (color.equals("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			} else if (color.equals("green")) {
				Tortoise.setPenColor(Color.GREEN);
			} else if (color.equals("end")) {
				System.exit(0);
			} else {
				Tortoise.setPenColor(Colors.getRandomColor());
			}
			Tortoise.move(100);
			Tortoise.turn(-90);
			Tortoise.move(100);
			Tortoise.turn(-90);
			Tortoise.move(100);
			Tortoise.turn(-90);
			Tortoise.move(100);
			Tortoise.turn(-90);
		}
	}
	
}
