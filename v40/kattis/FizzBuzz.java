package kattis;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fizz = sc.nextInt();

		int buzz = sc.nextInt();

		int repeat = sc.nextInt();

		for (int i = 1; i <= repeat; i++) {

			if (i % fizz == 0 && i % buzz == 0) {

				System.out.println("FizzBuzz");

			} else if (i % fizz == 0) {

				System.out.println("Fizz");

			} else if (i % buzz == 0) {

				System.out.println("Buzz");

			} else {

				System.out.println(i);
			}

		}
	}
}