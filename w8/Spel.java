import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {

		// Jag vet inte hur man ska f� det att starta om annars
		game();
	}

	public static int game() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number = 0;
		int guess = 0;
		boolean alive = true;
		int lives = 5;
		int guesses = 0;

		// Val av sv�righetsgrad med switch case under
		int choice;
		System.out.println("V�lkommen, v�lj sv�righetsgrad:\n");
		System.out.println("1 = L�tt");
		System.out.println("2 = Medel");
		System.out.println("3 = Sv�rt\n");

		// Try catch f�r att det ska defaulta till l�tt om det inte skrivs en int
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
			System.out.println("\nGissa talet mellan 1-1000\n");
			// medium number generator
			number = (int) (Math.random() * 1000);
			break;
		case 3:
			System.out.println("\nGissa talet mellan 1-1000\n");
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
					System.out.println("Du har f�rlorat. Talet var " + number + "\n");
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

				// olika grattismeddelanden f�r l�tt/medium och sv�rt
				if (choice == 1 || choice == 2) {
					System.out.println("\nGrattis, du har r�tt. Det tog " + (guesses+1) + " gissningar");
				}
				if (choice == 3) {
					System.out.println("\nGrattis, du har vunnit med " + lives + " liv kvar");
				}
				break;
			} else if (guess > number) {
				System.out.println("L�gre");
			} else if (guess < number) {
				System.out.println("H�gre");
			}

			if (choice == 1 || choice == 2) {
				guesses++;
				System.out.println("\nDu har gissat " + guesses + " G�nger\n");
			}
		}

		System.out.println("\nVill du k�ra igen?\n 1 = ja\n 2 = nej");

		// Try catch f�r att bokst�ver inte ska crasha
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			choice = 2;
		}

		// Scuffed starta om
		switch (choice) {
		case 1:
			game();

		case 2:
			System.out.println("\nKom tillbaka n�gon g�ng");
			break;

		default:
			System.out.println("\nskriv ett riktigt svar n�sta g�ng\n");
			break;
		}
		return number;
	}
}