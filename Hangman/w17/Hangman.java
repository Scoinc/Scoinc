import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	private static String fillword = "";
	private static ArrayList<String> wrongs = new ArrayList<>();

	/*
	 * Denna skiten �r s� seg och jag vet inte varf�r
	 */
	public static void main(String[] args) {
		boolean start = true;

		while (start) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			fillword = "";
			wrongs.clear();
			
			// Val av sv�righetsgrad med switch case under
			int choice;
			String word = "bug here";
			System.out.println("\nV�lkommen, v�lj ord:\n");
			System.out.println("1 = f�rbest�mmt ord\n2 = skriv ord sj�lv\n");

			// short try/catch
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				choice = 1;
				System.out.println("du var inte bra nog p� att v�lja ett ord s� jag gjorde det �t dig");
			}

			switch (choice) {
			case 1:
				System.out.println("\nGissa ordet\n");
				// grab word from wordlist
				String[] wordlist = { "short", "osteoporosis", "pterodactyl", "supercalifragilisticexpialidocious",
						"banana" };
				word = wordlist[(int) (Math.random() * wordlist.length)];

				System.out.println(game(word));

				break;
			case 2:
				System.out.println("\nSkiv ett ord\n");
				// input own word here
				word = sc.next();
				System.out.println(game(word));

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

		fillword(word);

		// S� m�nga str�ck den
		int lives = 7;

		for (int i = lives; i > 0;) {

			if (!fillword.contains("*")) {
				break;
			}

			char cguess = 'b';
			System.out.println("Gissa p� bokstav/ord");
			System.out.println(fillword);

			String guess = sc.next().toLowerCase();

			/*
			 * Om gissningen inte �r en bokstav �r det antagligen en gissning p� det r�tta
			 * ordet
			 */

			if(wrongs.toString().contains(guess)) {
				System.out.println("Du har redan gissat p� den");
			}
				
			else if (guess.equals(word)) {
				break;
			}

			// Om gissningen �r bokstav
			else if (guess.length() == 1) {
				cguess = guess.charAt(0);

				if (word.contains(guess)) {
					status(true, word, cguess, lives);
				}

				else {
					lives--;
					status(false, word, cguess, lives);
					i--;
					wrongs.add(guess);
				}
			}

			else {
				lives--;
				status(false, word, cguess, lives);
				i--;
			}
			
			System.out.println("fel gissningar: " + wrongs.toString());
		}

		String win = "bug here";

		if (lives <= 0) {
			win = "You lost, too bad.";
		}

		else {
			win = "\nYou won, the word was: " + word + "\n";
		}

		return win;
	}

	private static void fillword(String word) {
		// TODO Auto-generated method stub
		for (int i = 0; i < word.length(); i++) {
			fillword += "*";
		}
	}

	private static void status(boolean bnan, String word, char cguess, int lives) {
		// TODO Auto-generated method stub

		if (bnan) {
			for (int i = 0; i < word.length(); i++) {
				if (cguess == word.charAt(i)) {
					char[] wordarray = fillword.toCharArray();
					for (int j = 0; j < word.length(); j++) {
						if (word.toLowerCase().charAt(j) == cguess) {
							wordarray[j] = cguess;
						}
					}
					fillword = new String(wordarray);
				}
			}
		}
		//Ascii hangman h�mtad fr�n: https://gist.github.com/chrishorton/8510732aa9a80a03c829b09f12e20d9c#file-hangmanwordbank-py-L46
		else {
			switch (lives) {

			case 6:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 5:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 4:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 3:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 2:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 1:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
						+ "      |\r\n" + "=========");
				break;

			case 0:
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n"
						+ "      |\r\n" + "=========");
			}
		}
	}
}
