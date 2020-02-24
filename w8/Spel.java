import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double number = Math.random();
		
		int choice;
		System.out.println("Välkommen, välj svårighetsgrad:\n");
		System.out.println("1 = Lätt");
		System.out.println("2 = Medel");
		System.out.println("3 = Svårt\n");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\nGissa talet mellan 1-100\n");
			//easy number generator
			number *= Math.random()*100 -1 +1;
			break;
		case 2:
			System.out.println("\nGissa talet mellan 1-10000\n");
			//medium number generator
			break;
		case 3:
			System.out.println("\nGissa talet mellan 1-1000000\n");
			//hard number generator
			break;

		default:
			System.out.println("\nnej\n");
			break;
		}
		
		System.out.println(number);
		int answer = (int)number;
		System.out.println(answer);
	}

}
