import java.util.Scanner;

public class uppg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double total = 0;
		double antal = 0;
		double i = 5;

		while (i > 0) {
			System.out.println("skriv ett nummer, 0 för att avsluta");
			i = sc.nextDouble();
			total = total + i;
			antal++;
		}
		antal--;
		double medel = total / antal;
		System.out.println("total: " + total + "	medelvärde: " + medel);

	}
}
