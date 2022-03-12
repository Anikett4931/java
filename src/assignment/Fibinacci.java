package assignment;

import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		int c;
		int a = 0;
		int b = 1;
	//	int num;
	//	Scanner s = new Scanner(System.in);
		//System.out.println("enter num---");
	//	num=s.nextInt();
		for (int i = 1; i<= 5; i++) {
			c = a + b;

			a = b;
			b = c;
			System.out.println("" + c);

		}

	}

}
