package main;

import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		for (int i = 0; i < 400; i++) {
			Tortoise.
			setSpeed(10);
			Tortoise.turn(1);
				Tortoise.move(1);
			
		}
	}
	public static void drawSquare(){
		for (int i = 0; i < 4; i++) {
			Tortoise.move(30);
		Tortoise.turn(90);}
	}
	public static void drawTriangle(){
		for (int i = 0; i < 4; i++) {
			Tortoise.move(30);
		Tortoise.turn(120);}
	}
	public static void drawTriangle(){
		for (int i = 0; i < 140; i++) {
			Tortoise.move(1);
		Tortoise.turn(1);}
	}
	// 1. Make a new class, create a main method, and show the tortoise.

	// 2. Have the Tortoise draw a square.

	// 3. Extract this code into a drawSquare() method.

	// 4. Have the Tortoise draw a triangle.

	// 5. Extract this code into a drawTriangle() method.
	//
	// 6. Have the Tortoise draw a circle.
	//
	// 7. Extract this code into a drawCircle() method.
	//
	// 8. Ask the user which shape they want. Draw the appropriate shape
	// depending on their answer.
	//
	// 9. Ask the user which color they want. Color the the shape depending on
	// their answer.

}
