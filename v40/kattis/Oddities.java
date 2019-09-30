package kattis;
import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int cases = input.nextInt();

		while (cases-- > 0) {

			int in = input.nextInt();

			System.out.println(in % 2 == 0 ? in + " is even" : in + " is odd");
		}
	}
}