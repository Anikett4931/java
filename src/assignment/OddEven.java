package assignment;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int n, i;
		
		Scanner sc =  new Scanner (System.in);
		System.out.println("enter num----");
		n=sc.nextInt();
		for(i=0; i<=n;i++) {
			
			if(i % 2 == 0) {
				System.out.println("num is even "+ i);
			}
			else {
				System.out.println("num is odd " + i );
			}
		}
		
		
		

	}

}
