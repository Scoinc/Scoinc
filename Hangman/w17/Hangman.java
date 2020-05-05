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

			// short try/catch
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

				System.out.println(game(word));

				break;
			case 2:
				System.out.println("\nSkiv ett ord\n");
				// input word to be programmed

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
		ArrayList<Character> guessword = new ArrayList<Character>();
		for(char c : word.toCharArray()) {
			guessword.add(c);
		}
		ArrayList<Character> asterisk = new ArrayList<Character>();
		for(int i = word.length(); i > 0; i--) {
			asterisk.add('*');
		}
		
		String word2 = asterisk.toString().replaceAll(", ", "");

		int lives = 7;
		long guesses = 0;

		for (int i = lives; i > 0; i--) {
			System.out.println("\nDu har " + i + " liv kvar");
			System.out.println(word2);
			String guess = sc.next();
			guess = guess.toLowerCase();
			//forts�tt koda h�r
			
			if (guessword.contains(guess)) {
				System.out.println("test");
			}
			
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
