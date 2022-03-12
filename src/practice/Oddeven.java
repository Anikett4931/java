package practice;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		int n;
		System.out.println("enter num: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("num is even");

		} else {
			System.out.println("num is odd");
		}
	}

}
