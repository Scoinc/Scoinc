import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {

	private static String fillword = "";
	private static ArrayList<String> wrongs = new ArrayList<>();

	/*
	 * Ibland blir den seg, jag vet inte varför.
	 */
	public static void main(String[] args) {
		boolean start = true;

		while (start) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			fillword = "";
			wrongs.clear();

			// Val av svårighetsgrad med switch case under
			int choice;
			String word = "bug here";
			System.out.println("\nVälkommen, välj ord:\n");
			System.out.println("1 = förbestämmt ord\n2 = skriv ord själv\n");

			// kort try/catch
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				choice = 1;
				System.out.println("du var inte bra nog på att välja ett ord så jag gjorde det åt dig");
			}

			switch (choice) {
			case 1:
				System.out.println("\nGissa ordet\n");
				// ta ord från ordlistan
				String[] wordlist = { "short", "osteoporosis", "pterodactyl", "supercalifragilisticexpialidocious",
						"banana" };
				word = wordlist[(int) (Math.random() * wordlist.length)];

				System.out.println(game(word));

				break;
			case 2:
				System.out.println("\nSkiv ett ord\n");
				// lägg in eget ord
				word = sc.next();
				System.out.println(game(word));

				break;

			default:
				System.out.println("\nnej\n");
				break;
			}
		}

		System.out.println("\nKom tillbaka någon gång");
	}

	/*
	 * själva Spelet
	 */
	public static String game(String word) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		fillword(word);

		// Så många versioner ascii koden inkluderade
		int lives = 7;

		for (int i = lives; i > 0;) {

			// Om ordet inte har * är det därför klart och du har vunnit
			if (!fillword.contains("*")) {
				break;
			}

			//cguess är i en else sats och måste därför initieras här.
			char cguess = 'b';
			//printar gömda ordet och promptar gissning
			System.out.println("Gissa på bokstav/ord");
			System.out.println(fillword);

			//tar in gissning och ser till att den räknas som lowercase för gissningar
			String guess = sc.next().toLowerCase();
			
			//Kollar om din char redan är gissad
			if (wrongs.toString().contains(guess)) {
				System.out.println("Du har redan gissat på den");
			}

			//om du gissar rätt ord vinner du
			else if (guess.equals(word)) {
				break;
			}

			// Om gissningen är bokstav
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

			//Om du gissar på ett helt ord som inte är rätt
			else {
				lives--;
				status(false, word, cguess, lives);
				i--;
			}

			System.out.println("fel gissningar: " + wrongs.toString());
		}

		//initierar string
		String win = "bug here";

		//om du får slut på liv förlorar du
		if (lives <= 0) {
			win = "You lost, too bad.";
		}

		//om spelet är över och du har liv kvar vinner du
		else {
			win = "\nYou won, the word was: " + word + "\n";
		}

		return win;
	}

	//Skapar asterisk ordet till samma längd som ordet
	private static void fillword(String word) {
		// TODO Auto-generated method stub
		for (int i = 0; i < word.length(); i++) {
			fillword += "*";
		}
	}

	//De saker som händer efter gissning
	private static void status(boolean bnan, String word, char cguess, int lives) {
		// TODO Auto-generated method stub

		//Om gissning är rätt så skapas det en char array och det byts ut till den gissade bokstaven
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
		//När du förlorar liv printar den en ascii hangman beroende på kvarvarande liv
		// Ascii hangman hämtad från:
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
