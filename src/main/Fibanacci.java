package main;

public class Fibanacci {public static void main(String[] args) {
	int a=1;
	int b=1;
	for (int i = 0; i < 40; i++) {
		int hi = b;
		System.out.println(a);
		b =a+b;
		a=hi;
		
		
	}
}

}
