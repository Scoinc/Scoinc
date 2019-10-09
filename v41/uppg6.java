import java.util.Scanner;

public class uppg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv radie:");
		double radie = sc.nextDouble();
		System.out.println("Skriv höjd:");
		double height = sc.nextDouble();

		radie = radie * 3.14159265368979323;
		double volym = radie * height;
		System.out.println("Cylindern är " + volym + " hög"); // tycker inte jag behöver något mer beskrivande än 'hög'
	}

}
