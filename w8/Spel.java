import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {
		game();
		// Meddelandet skickas flera gånger om man startar om om det inte är här
		System.out.println("\nKom tillbaka någon gång");

		// Fan, jag skulle bara kunna ha använt while(start)
	}

	public static int game() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		// Resettar/definerar alla värden
		int number = 0;
		int guess = 0;
		boolean alive = true;
		int lives = 5;
		long guesses = 0;

		// Val av svårighetsgrad med switch case under
		int choice;
		System.out.println("\nVälkommen, välj svårighetsgrad:\n");
		System.out.println("1 = Lätt");
		System.out.println("2 = Medel");
		System.out.println("3 = Svårt");
		System.out.println("4 = Eget intervall\n");

		// Try catch för att det ska defaulta till lätt om det inte skrivs en int
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
		case 4:
			// Medan Jag inte gillar att använda try/catch överallt så kan Jag ingen bättre
			// metod för att inte få det att krasha
			// Custom number generator
			try {
				System.out.println("\nSkriv ett maxtal att gissa\n");
				int max = sc.nextInt();
				number = (int) (Math.random() * max + 1);
				System.out.println("\nSkriv antal liv du vill ha");
				lives = sc.nextInt();
				break;
			} catch (Exception e) {
				number = (int) (Math.random() * 1000);
				break;
			}

		default:
			System.out.println("\nnej\n");
			break;
		}

		// Gissningarna börjar här
		System.out.println("Gissa nummret\n");

		while (alive) {

			// livsystem
			if (choice == 3 || choice == 4) {
				System.out.println("Du har " + (lives) + " liv kvar\n");
				lives--;
				// Förlust när slut på liv

				if (lives == -1) {
					System.out.println("Du har förlorat. Talet var " + number + "\n");
					break;
				}
			}

			// Try catch för om man skriver något som inte är en int
			try {
				guess = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Vad vill du min kod");
				break;
			}

			// Rätt eller fel nummer
			if (guess == number) {

				// olika grattismeddelanden för lätt/medium och svårt/custom
				if (choice == 1 || choice == 2) {
					System.out.println("\nGrattis, du har rätt. Det tog " + (guesses + 1) + " gissningar");
				} else if (choice == 3 || choice == 4) {
					System.out.println("\nGrattis, du har vunnit med " + lives + " liv kvar");
				}
				break;
			} else if (guess > number) {
				System.out.println("Lägre");
			} else if (guess < number) {
				System.out.println("Högre");
			}

			if (choice == 1 || choice == 2) {
				guesses++;
				System.out.println("\nDu har gissat " + guesses + " Gånger\n");
			}

			/*
			 * Debugkod: System.out.println(number);
			 */
		}

		// Om du ska starta om
		restart();

		// Helt redundant men den måste existera
		return number;
	}

	public static int restart() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\nVill du köra igen?\n 1 = ja\n 2 = nej");

		int choice = 0;
		// Try catch för att bokstäver inte ska crasha
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
			break;

		default:
			System.out.println("\nskriv ett riktigt svar nästa gång");
			break;
		}
		return choice;
	}
}