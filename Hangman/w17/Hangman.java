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
			String word = "bug here";
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
				String[] wordlist = { "short", "osetoporosis", "pterodactyl", "supercalifragilisticexpialidocious",
						"banana" };
				int random = (int) (Math.random() * wordlist.length);
				word = wordlist[random];
				// debug: System.out.println(word);

				System.out.println(game(word));

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

	public static String game(String word) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		word = word.toLowerCase();
		ArrayList<Character> word2 = new ArrayList<Character>();
		for(int i = word.length(); i > 0; i--) {
			word2.add(word.charAt(i));
		}

		int lives = 7;
		long guesses = 0;

		for (int i = lives; i > 0; i--) {
			System.out.println("\nDu har " + i + " liv kvar");
			String guess = sc.next();
			//forts�tt koda h�r
			
			
			guess = guess.toLowerCase();
			
			lives--;
		}

		String win = "bug here";

		System.out.println(lives);
		if (lives <= 0) {
			win = "You lost, too bad.";
		}

		else {
			win = "You won, congratultaions!";
		}

		return win;
	}
}
