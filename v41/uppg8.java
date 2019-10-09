import java.util.Scanner;

public class uppg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv timmar, minuetr och sekunder:");
		int timmar = sc.nextInt();
		int minuetr = sc.nextInt();
		int sekunder = sc.nextInt();
		int sum = 0;

		sum += timmar * 3600;
		sum += minuetr * 60;
		sum += sekunder;

		System.out.println(sum + " sekunder");
	}
}