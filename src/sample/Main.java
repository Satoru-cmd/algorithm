package sample;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 5, 6, 7, 8};
		rcopy(a);


	}
	static void rcopy(int[] a) {
		int n = a.length;
		int b[] = new int[n];
		int m = b.length;
		for(int i = 0; i < n; i++) {
			b[i] = a[m - 1];
			m--;
		}
		System.out.println(Arrays.toString(b));
	}
}