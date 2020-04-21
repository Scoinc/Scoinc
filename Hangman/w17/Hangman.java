import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		boolean start = true;

		while (start) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			// Val av svårighetsgrad med switch case under
			int choice;
			System.out.println("\nVälkommen, välj ord:\n");
			System.out.println("1 = förbestämmt ord\n2 = skriv ord själv\n");

			// simple try/catch
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				choice = 1;
			}

			switch (choice) {
			case 1:
				System.out.println("\nGissa ordet\n");
				// grab word from wordlist
				wordlist();

				break;
			case 2:
				System.out.println("\nSkiv ett ord\n");
				// input word

				break;

			default:
				System.out.println("\nnej\n");
				break;
			}
		}
		
		System.out.println("\nKom tillbaka någon gång");
	}

	/*
	 * public static int game() {
	 * 
	 * // Resettar/definerar alla värden int guess = 0; boolean alive = true; int
	 * lives = 5; long guesses = 0;
	 * 
	 * // Gissningarna börjar här System.out.println("Gissa nummret\n");
	 * 
	 * while (alive) {
	 * 
	 * // livsystem if (choice == 3 || choice == 4) { System.out.println("Du har " +
	 * (lives) + " liv kvar\n"); lives--; // Förlust när slut på liv
	 * 
	 * if (lives == -1) { System.out.println("Du har förlorat. Talet var " + number
	 * + "\n"); break; } }
	 * 
	 * // Try catch för om man skriver något som inte är en int try { guess =
	 * sc.nextInt(); } catch (Exception e) {
	 * System.out.println("Vad vill du min kod"); break; }
	 * 
	 * // Rätt eller fel nummer if (guess == number) {
	 * 
	 * // olika grattismeddelanden för lätt/medium och svårt/custom if (choice == 1
	 * || choice == 2) { System.out.println("\nGrattis, du har rätt. Det tog " +
	 * (guesses + 1) + " gissningar"); } else if (choice == 3 || choice == 4) {
	 * System.out.println("\nGrattis, du har vunnit med " + (lives + 1) +
	 * " liv kvar"); } break; } else if (guess > number) {
	 * System.out.println("Lägre"); } else if (guess < number) {
	 * System.out.println("Högre"); }
	 * 
	 * if (choice == 1 || choice == 2) { guesses++;
	 * System.out.println("\nDu har gissat " + guesses + " Gånger\n"); }
	 * 
	 * /* Debugkod: System.out.println(number);
	 *
	 * }
	 *
	 * // Om du ska starta om restart();
	 *
	 * // return number; }
	 */

	// Borde inte behövas
	/*
	 * public static int restart() {
	 * 
	 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
	 * System.out.println("\nVill du köra igen?\n 1 = ja\n 2 = nej");
	 * 
	 * int choice = 0; // Try catch för att bokstäver inte ska crasha try { choice =
	 * sc.nextInt(); } catch (Exception e) { choice = 2; } // Scuffed starta om
	 * switch (choice) { case 1: game();
	 * 
	 * case 2: break;
	 * 
	 * default: System.out.println("\nskriv ett riktigt svar nästa gång"); break; }
	 * // Igen helt redundant för jag hade kunnat använda en while loop return
	 * choice; }
	 */

	public static String wordlist() {

		String[] wordlist = { "banana", "banana2", "banana3", "banana4", "banana5" };

		int random = (int) (Math.random()*5);
		String word = wordlist[random];
		System.out.println(word);
		return word;
	}
}
