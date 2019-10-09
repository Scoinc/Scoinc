import java.util.Scanner;

public class uppg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		long digit;
		long sum = 0;
		
		System.out.println("Skriv ett heltal:");
		long number = sc.nextLong();

		while (number != 0) {
			
			digit = number % 10;
			sum += digit;
			number = number/10;
		}
		System.out.println(sum);
	}

}
