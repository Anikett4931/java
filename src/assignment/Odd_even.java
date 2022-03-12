package assignment;

import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		int n;
		int i;

		Scanner s = new Scanner(System.in);
		System.out.println("enter num ------");
		i = s.nextInt();

	//	for (i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				System.out.println("odd number :" + i + "");
			}
			else {
				System.out.println("even number :" + i + "");
			}
		}

	}

 //}
