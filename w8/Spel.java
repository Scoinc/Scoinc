import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number = 0;
		int guess = 0;
		boolean alive = true;
		int lives = 5;

		// Val av sv�righetsgrad med switch case under
		int choice;
		System.out.println("V�lkommen, v�lj sv�righetsgrad:\n");
		System.out.println("1 = L�tt");
		System.out.println("2 = Medel");
		System.out.println("3 = Sv�rt\n");

		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			choice = 1;
		}

		switch (choice) {
		case 1:
			System.out.println("\nGissa talet mellan 1-100\n");
			// easy number generator
			number = (int) (Math.random() * 100);
			break;
		case 2:
			System.out.println("\nGissa talet mellan 1-10000\n");
			// medium number generator
			number = (int) (Math.random() * 1000);
			break;
		case 3:
			System.out.println("\nGissa talet mellan 1-1000000\n");
			// hard number generator
			number = (int) (Math.random() * 1000);
			break;

		default:
			System.out.println("\nnej\n");
			break;
		}

		// Spel b�rjar
		System.out.println("Gissa nummret\n");

		while (alive) {
			if (choice == 3) {
				System.out.println("Du har " + (lives) + " liv kvar\n");
				lives--;
				// F�rlust n�r slut p� liv

				if (lives == -1) {
					System.out.println("Du har f�rlorat");
					break;
				}
			}
			// Try catch f�r om man skriver n�got som inte �r en int
			try {
				guess = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Vad vill du min kod");
				break;
			}

			// R�tt eller fel med
			if (guess == number) {
				System.out.println("\nGrattis, du har r�tt");
				break;
			} else if (guess > number) {
				System.out.println("L�gre");
			} else if (guess < number) {
				System.out.println("H�gre");
			}
		}
	}
}
