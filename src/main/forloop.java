package main;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class forloop {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i += 3) {
System.out.println("");
			for (int j = i; j < i + 3; j++) {
				System.out.print("" + j );
			}
		}

	}

}
