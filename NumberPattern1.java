package test;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		printPattern(n);
	}

	static void printPattern(int n) {
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("   ");
			}
			for (int j = i; j <= n; j++) {
				System.out.printf("%2d ", num++);
			}
			System.out.println();
		}
	}
}
