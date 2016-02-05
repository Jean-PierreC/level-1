package main;

import org.teachingextensions.logo.Tortoise;

public class shapecontest {
	public static void main(String[] args) {
		for (int i = 10; i < 84487; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(9);
			Tortoise.turn(4395);
			Tortoise.turn(i*233);
			Tortoise.turn(i*990543789);
			

		}
	}
}
