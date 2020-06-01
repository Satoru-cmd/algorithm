package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("３身の整数の最大値を求めます");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(med3(a, b, c));
	}

	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}

}
