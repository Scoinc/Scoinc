import java.util.Scanner;

public class uppg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int total = 1;
		int antal = 0;
		int i = 0;

		while (total < 100000 && antal < 10) {
			System.out.println("skriv nummer");
			i = sc.nextInt();
			total = total * i;
			antal++;
		}
		System.out.println("total: " + total);
	}
}
