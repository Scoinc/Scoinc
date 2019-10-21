import java.util.Scanner;

public class Mondayawgfviyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv 2 tal bror");

		int tal1 = sc.nextInt();
		int tal2 = sc.nextInt();

		minstaTal(tal1, tal2);

	}

	public static void minstaTal(int tal1, int tal2) {
		if (tal1 < tal2) {
			System.out.println(tal1 + " är mindre");
		}

		else {
			System.out.println(tal2 + " är mindre");
		}
	}
}