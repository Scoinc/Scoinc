import java.util.Scanner;

public class uppg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv radie:");
		double radie = sc.nextDouble();
		System.out.println("Skriv h�jd:");
		double height = sc.nextDouble();

		radie = radie * 3.14159265368979323;
		double volym = radie * height;
		System.out.println("Cylindern �r " + volym + " h�g"); // tycker inte jag beh�ver n�got mer beskrivande �n 'h�g'
	}

}
