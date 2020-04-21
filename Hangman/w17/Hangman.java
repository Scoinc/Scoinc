import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		boolean start = true;

		while (start) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			// Val av sv�righetsgrad med switch case under
			int choice;
			System.out.println("\nV�lkommen, v�lj ord:\n");
			System.out.println("1 = f�rbest�mmt ord\n2 = skriv ord sj�lv\n");

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
		
		System.out.println("\nKom tillbaka n�gon g�ng");
	}

	/*
	 * public static int game() {
	 * 
	 * // Resettar/definerar alla v�rden int guess = 0; boolean alive = true; int
	 * lives = 5; long guesses = 0;
	 * 
	 * // Gissningarna b�rjar h�r System.out.println("Gissa nummret\n");
	 * 
	 * while (alive) {
	 * 
	 * // livsystem if (choice == 3 || choice == 4) { System.out.println("Du har " +
	 * (lives) + " liv kvar\n"); lives--; // F�rlust n�r slut p� liv
	 * 
	 * if (lives == -1) { System.out.println("Du har f�rlorat. Talet var " + number
	 * + "\n"); break; } }
	 * 
	 * // Try catch f�r om man skriver n�got som inte �r en int try { guess =
	 * sc.nextInt(); } catch (Exception e) {
	 * System.out.println("Vad vill du min kod"); break; }
	 * 
	 * // R�tt eller fel nummer if (guess == number) {
	 * 
	 * // olika grattismeddelanden f�r l�tt/medium och sv�rt/custom if (choice == 1
	 * || choice == 2) { System.out.println("\nGrattis, du har r�tt. Det tog " +
	 * (guesses + 1) + " gissningar"); } else if (choice == 3 || choice == 4) {
	 * System.out.println("\nGrattis, du har vunnit med " + (lives + 1) +
	 * " liv kvar"); } break; } else if (guess > number) {
	 * System.out.println("L�gre"); } else if (guess < number) {
	 * System.out.println("H�gre"); }
	 * 
	 * if (choice == 1 || choice == 2) { guesses++;
	 * System.out.println("\nDu har gissat " + guesses + " G�nger\n"); }
	 * 
	 * /* Debugkod: System.out.println(number);
	 *
	 * }
	 *
	 * // Om du ska starta om restart();
	 *
	 * // return number; }
	 */

	// Borde inte beh�vas
	/*
	 * public static int restart() {
	 * 
	 * @SuppressWarnings("resource") Scanner sc = new Scanner(System.in);
	 * System.out.println("\nVill du k�ra igen?\n 1 = ja\n 2 = nej");
	 * 
	 * int choice = 0; // Try catch f�r att bokst�ver inte ska crasha try { choice =
	 * sc.nextInt(); } catch (Exception e) { choice = 2; } // Scuffed starta om
	 * switch (choice) { case 1: game();
	 * 
	 * case 2: break;
	 * 
	 * default: System.out.println("\nskriv ett riktigt svar n�sta g�ng"); break; }
	 * // Igen helt redundant f�r jag hade kunnat anv�nda en while loop return
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
