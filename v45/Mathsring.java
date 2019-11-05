import java.util.Scanner;

public class Mathsring {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double svar = Math.sqrt((Math.pow(3, 2) + 4));
		System.out.println(svar);

		double pi = Math.PI;
		System.out.println(pi);

		Math.max(3, 7);
		String mening = "Tomas mycket het man ja";
		System.out.println(mening);
		/*String mening2 = input.nextLine();
		if (mening.equals(mening2)) {
			System.out.println("Det är samma mening");
		}*/
		
		System.out.println(mening.length());
		System.out.println(mening.toUpperCase());
		System.out.println("  Bomas Beis kan ej stavelsa  ".trim().toLowerCase());
		System.out.println("Tomas bäst lärare".replace("a", "4"));
		
		int a = 7;
		int b = 3;
		
		double c = (double)a / (double)b;
		
		System.out.println(c);
		
	}
}
