package kattis;

import java.util.Scanner;

public class Rtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r1 = 0;
		int r2 = 0;
		int s = 0;

		Scanner input = new Scanner(System.in);

		// System.out.println("Skriv två tal");

		r1 = input.nextInt();
		s = input.nextInt();

		r2 = s * 2 - r1;

		System.out.println(r2);
	}

}
