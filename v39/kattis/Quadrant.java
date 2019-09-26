package kattis;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int tal1 = 0;
		int tal2 = 0;

		tal1 = input.nextInt();
		tal2 = input.nextInt();

		if (tal1 >= 0 && tal2 >= 0) {
			System.out.println("1"); 
		}

		else if (tal1 <= 0 && tal2 >= 0) {
			System.out.println("2");
		}

		else if (tal1 <= 0 && tal2 <= 0) {
			System.out.println("3");
		}

		else if (tal1 >= 0 && tal2 <= 0) {
			System.out.println("4");
		} 
	}

}
