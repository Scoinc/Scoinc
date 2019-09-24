package kattis;

import java.util.Scanner;

public class timeloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 0;
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Skriv ett tal 1-100");
		
		N = input.nextInt();
		
		for (int i = 1;i <= N; i++) {
			System.out.println(i + " Abracadabra");
		}
	}
}