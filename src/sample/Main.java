package sample;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

	}

	//配列aを逆順にしてコピー
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

	//整数aの素数判定
	static void primenumber(int a) {
		for(int i = 2; i < a; i++) {
			if(a % i == 0) {
				System.out.println("素数ではない");
				break;
			}
			if(a == i+1) {
				System.out.println("素数");
			}
		}
	}
}