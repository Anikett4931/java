package assignment;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = { 1, 4, 6, 9, 3, 5, 7 };
		System.out.println("array before sorting" + Arrays.toString(a));
		int n = a.length-1;
		for (int i = 0; i <=n ; i++) {

			for (int j = i+1; j <=n; j++) {

				if (a[i]>a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println("arrays after sorting" + Arrays.toString(a));

	}

}
