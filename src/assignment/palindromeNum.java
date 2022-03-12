package assignment;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String[] args) {

		int n;
		int r;
		int s = 0;
		System.out.println("enter any num");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int c = n;

		while (n > 0) {

			r = n % 10;
			s = (s * 10) + r;
			n = n / 10;

		}
		System.out.println(s);
		if (c == s) {
			System.out.println("palindrome string");
		} else {
			System.out.println("no palindrome");
		}

	}

}
