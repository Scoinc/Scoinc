package kattis;

import java.util.Scanner;

public class TwoStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int in = 0;

		in = input.nextInt();

		if (in % 2 == 1) {
			System.out.println("alice");
		} else if (in % 2 == 0) {
			System.out.println("bob");
		}

	}
}
