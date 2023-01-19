package program_practice;

import java.util.Scanner;

public class FactorialNumber {
	static int num; // instance vairiables
	static int fact; // instance vairiables

	public static void factorial(int n) {
		num = n; // 5
		fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i; // 1,2,6,24,120
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		factorial(num);

		System.out.println(fact);

	}

}
