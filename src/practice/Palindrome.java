package practice;

public class Palindrome {

	public static void main(String[] args) {
		int n = 121;
		int s = 0;
		int r;
		int c = n;
		while (n > 0) {

			r = n % 10;
			s = (s * 10) + r;
			n = n / 10;

		}
		if(c==s) {
			System.out.println("palindrome num");
		}
		else {
			System.out.println("no palindrom");
		}

	}

}
