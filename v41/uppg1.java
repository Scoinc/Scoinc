import java.util.Scanner;

public class uppg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("skriv 2 tal");
		int tal1 = sc.nextInt();
		int tal2 = sc.nextInt();

		System.out.println(tal1 < tal2 ? tal1 + " is lower" : tal2 + " is lower");
	}

}
