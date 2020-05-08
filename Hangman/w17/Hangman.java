import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	private static String fillword = "";
	private static ArrayList<String> wrongs = new ArrayList<>();

	/*
	 * Ibland blir den seg, jag vet inte varf�r.
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

			// kort try/catch
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				choice = 1;
				System.out.println("du var inte bra nog p� att v�lja ett ord s� jag gjorde det �t dig");
			}

			switch (choice) {
			case 1:
				System.out.println("\nGissa ordet\n");
				// ta ord fr�n ordlistan
				String[] wordlist = { "short", "osteoporosis", "pterodactyl", "supercalifragilisticexpialidocious",
						"banana" };
				word = wordlist[(int) (Math.random() * wordlist.length)];

				System.out.println(game(word));

				break;
			case 2:
				System.out.println("\nSkiv ett ord\n");
				// l�gg in eget ord
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

	/*
	 * sj�lva Spelet
	 */
	public static String game(String word) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		fillword(word);

		// S� m�nga versioner ascii koden inkluderade
		int lives = 7;

		for (int i = lives; i > 0;) {

			// Om ordet inte har * �r det d�rf�r klart och du har vunnit
			if (!fillword.contains("*")) {
				break;
			}

			//cguess �r i en else sats och m�ste d�rf�r initieras h�r.
			char cguess = 'b';
			//printar g�mda ordet och promptar gissning
			System.out.println("Gissa p� bokstav/ord");
			System.out.println(fillword);

			//tar in gissning och ser till att den r�knas som lowercase f�r gissningar
			String guess = sc.next().toLowerCase();
			
			//Kollar om din char redan �r gissad
			if (wrongs.toString().contains(guess)) {
				System.out.println("Du har redan gissat p� den");
			}

			//om du gissar r�tt ord vinner du
			else if (guess.equals(word)) {
				break;
			}

			// Om gissningen �r bokstav
			else if (guess.length() == 1) {
				cguess = guess.charAt(0);

				//om bokstaven finns med i ordet
				if (word.contains(guess)) {
					status(true, word, cguess, lives);
				}

				//om bokstaven inte finns med i ordet
				else {
					lives--;
					status(false, word, cguess, lives);
					i--;
					wrongs.add(guess);
				}
			}

			//Om du gissar p� ett helt ord som inte �r r�tt
			else {
				lives--;
				status(false, word, cguess, lives);
				i--;
			}

			System.out.println("fel gissningar: " + wrongs.toString());
		}

		//initierar string
		String win = "bug here";

		//om du f�r slut p� liv f�rlorar du
		if (lives <= 0) {
			win = "You lost, too bad.";
		}

		//om spelet �r �ver och du har liv kvar vinner du
		else {
			win = "\nYou won, the word was: " + word + "\n";
		}

		return win;
	}

	//Skapar asterisk ordet till samma l�ngd som ordet
	private static void fillword(String word) {
		// TODO Auto-generated method stub
		for (int i = 0; i < word.length(); i++) {
			fillword += "*";
		}
	}

	//De saker som h�nder efter gissning
	private static void status(boolean bnan, String word, char cguess, int lives) {
		// TODO Auto-generated method stub

		//Om gissning �r r�tt s� skapas det en char array och det byts ut till den gissade bokstaven
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
		//N�r du f�rlorar liv printar den en ascii hangman beroende p� kvarvarande liv
		// Ascii hangman h�mtad fr�n:
		// https://gist.github.com/chrishorton/8510732aa9a80a03c829b09f12e20d9c#file-hangmanwordbank-py-L46
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
