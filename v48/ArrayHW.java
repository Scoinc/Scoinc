
public class ArrayHW {

	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println("Det finns " + sevens(numbers) + " sjuor \n");

		System.out.println("Det finns " + tom(names) + " personer som heter tom i listan \n");

		System.out.println(" ");

	}

	public static int sevens(int[] numbers) {

		int sevens = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 7) {
				sevens++;
			}
		}
		return sevens;
	}

	public static int tom(String[] names) {

		int tom = 0;

		for (int i = 0; i < names.length; i++) {

			if (names[i].contains("Tom")) {
				tom++;
			}

		}

		return tom;
	}

	public static int ammount(int[] numbers) {

		int ammount = 0;
		for (int i = 0; i < numbers.length; i++) {

			int zero = 0;
			int one = 0;
			int two = 0;
			int three = 0;
			int four = 0;
			int five = 0;
			int six = 0;
			int seven = 0;
			int eight = 0;
			int nine = 0;

			if (numbers[i] == 0) {
				zero++;
			}
			if (numbers[i] == 1) {
				one++;
			}
			if (numbers[i] == 2) {
				two++;
			}
			if (numbers[i] == 3) {
				three++;
			}
			if (numbers[i] == 4) {
				four++;
			}
			if (numbers[i] == 5) {
				five++;
			}
			if (numbers[i] == 6) {
				six++;
			}
			if (numbers[i] == 7) {
				seven++;
			}
			if (numbers[i] == 8) {
				eight++;
			}
			if (numbers[i] == 9) {
				nine++;
			}

			if (zero >= one && zero >= two && zero >= three && zero >= four && zero >= five && zero >= six
					&& zero >= seven && zero >= eight && zero >= nine) {
				System.out.println("högst tal: " + zero);
			}

			else if (one >= zero && one >= two && one >= three && one >= four && one >= five && one >= six
					&& one >= seven && one >= eight && one >= nine) {
				System.out.println("högst tal: " + one);
			} else if (two >= zero && two >= one && two >= three && two >= four && two >= five && two >= six
					&& two >= seven && two >= eight && two >= nine) {
				System.out.println("högst tal: " + two);
			} else if (three >= zero && three >= two && three >= one && three >= four && three >= five && three >= six
					&& three >= seven && three >= eight && three >= nine) {
				System.out.println("högst tal: " + three);
			} else if (four >= zero && four >= two && four >= three && four >= four && one >= five && four >= six
					&& four >= seven && four >= eight && four >= nine) {
				System.out.println("högst tal: " + four);
			} else if (five >= zero && five >= two && five >= three && five >= four && five >= one && five >= six
					&& five >= seven && five >= eight && five >= nine) {
				System.out.println("högst tal: " + five);
			} else if (six >= zero && six >= two && six >= three && six >= four && six >= five && six >= one
					&& six >= seven && six >= eight && six >= nine) {
				System.out.println("högst tal: " + six);
			} else if (seven >= zero && seven >= two && seven >= three && seven >= four && seven >= five && seven >= six
					&& seven >= seven && one >= eight && seven >= nine) {
				System.out.println("högst tal: " + seven);
			} else if (eight >= zero && eight >= two && eight >= three && eight >= four && eight >= five && eight >= six
					&& eight >= seven && eight >= one && eight >= nine) {
				System.out.println("högst tal: " + eight);
			} else if (nine >= zero && nine >= two && nine >= three && nine >= four && nine >= five && nine >= six
					&& nine >= seven && nine >= eight && nine >= one) {
				System.out.println("högst tal: " + nine);
			}

			if (zero <= one && zero <= two && zero <= three && zero <= four && zero <= five && zero <= six
					&& zero <= seven && zero <= eight && zero <= nine) {
				System.out.println("lägst tal: " + zero);
			}

			else if (one <= zero && one <= two && one <= three && one <= four && one <= five && one <= six
					&& one <= seven && one <= eight && one <= nine) {
				System.out.println("lägst tal: " + one);
			} else if (two <= zero && two <= one && two <= three && two <= four && two <= five && two <= six
					&& two <= seven && two <= eight && two <= nine) {
				System.out.println("lägst tal: " + two);
			} else if (three <= zero && three <= two && three <= one && three <= four && three <= five && three <= six
					&& three <= seven && three <= eight && three <= nine) {
				System.out.println("lägst tal: " + three);
			} else if (four <= zero && four <= two && four <= three && four <= four && one <= five && four <= six
					&& four <= seven && four <= eight && four <= nine) {
				System.out.println("lägst tal: " + four);
			} else if (five <= zero && five <= two && five <= three && five <= four && five <= one && five <= six
					&& five <= seven && five <= eight && five <= nine) {
				System.out.println("lägst tal: " + five);
			} else if (six <= zero && six <= two && six <= three && six <= four && six <= five && six <= one
					&& six <= seven && six <= eight && six <= nine) {
				System.out.println("lägst tal: " + six);
			} else if (seven <= zero && seven <= two && seven <= three && seven <= four && seven <= five && seven <= six
					&& seven <= seven && one <= eight && seven <= nine) {
				System.out.println("lägst tal: " + seven);
			} else if (eight <= zero && eight <= two && eight <= three && eight <= four && eight <= five && eight <= six
					&& eight <= seven && eight <= one && eight <= nine) {
				System.out.println("lägst tal: " + eight);
			} else if (nine <= zero && nine <= two && nine <= three && nine <= four && nine <= five && nine <= six
					&& nine <= seven && nine <= eight && nine <= one) {
				System.out.println("lägst tal: " + nine);
			}
		}
		return ammount;
	}
}
