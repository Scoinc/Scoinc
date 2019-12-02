
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

		System.out.println("Det finns flest " + ammount(numbers) + "or \n");

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

		int highest = 0;
		int lowest = 0;
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

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 0) {
				zero += 1;
			}
			if (numbers[i] == 1) {
				one += 1;
			}
			if (numbers[i] == 2) {
				two += 1;
			}
			if (numbers[i] == 3) {
				three += 1;
			}
			if (numbers[i] == 4) {
				four += 1;
			}
			if (numbers[i] == 5) {
				five += 1;
			}
			if (numbers[i] == 6) {
				six += 1;
			}
			if (numbers[i] == 7) {
				seven += 1;
			}
			if (numbers[i] == 8) {
				eight += 1;
			}
			if (numbers[i] == 9) {
				nine += 1;
			}
		}

		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);

		// highest
		if (zero >= one && zero >= two && zero >= three && zero >= four && zero >= five && zero >= six && zero >= seven
				&& zero >= eight && zero >= nine) {
			highest = 0;
		} else if (one >= zero && one >= two && one >= three && one >= four && one >= five && one >= six && one >= seven
				&& one >= eight && one >= nine) {
			highest = 1;
		} else if (two >= zero && two >= one && two >= three && two >= four && two >= five && two >= six && two >= seven
				&& two >= eight && two >= nine) {
			highest = 2;
		} else if (three >= zero && three >= two && three >= one && three >= four && three >= five && three >= six
				&& three >= seven && three >= eight && three >= nine) {
			highest = 3;
		} else if (four >= zero && four >= two && four >= three && four >= five && one >= five && four >= six
				&& four >= seven && four >= eight && four >= nine) {
			highest = 4;
		} else if (five >= zero && five >= two && five >= three && five >= four && five >= one && five >= six
				&& five >= seven && five >= eight && five >= nine) {
			highest = 5;
		} else if (six >= zero && six >= two && six >= three && six >= four && six >= five && six >= one && six >= seven
				&& six >= eight && six >= nine) {
			highest = 6;
		} else if (seven >= zero && seven >= two && seven >= three && seven >= four && seven >= five && seven >= six
				&& seven >= one && one >= eight && seven >= nine) {
			highest = 7;
		} else if (eight >= zero && eight >= two && eight >= three && eight >= four && eight >= five && eight >= six
				&& eight >= seven && eight >= one && eight >= nine) {
			highest = 8;
		} else if (nine >= zero && nine >= two && nine >= three && nine >= four && nine >= five && nine >= six
				&& nine >= seven && nine >= eight && nine >= one) {
			highest = 9;
		}

		// lowest
		if (zero <= one && zero <= two && zero <= three && zero <= four && zero <= five && zero <= six && zero <= seven
				&& zero <= eight && zero <= nine) {
			lowest = 0;
		}

		else if (one <= zero && one <= two && one <= three && one <= four && one <= five && one <= six && one <= seven
				&& one <= eight && one <= nine) {
			lowest = 1;
		} else if (two <= zero && two <= one && two <= three && two <= four && two <= five && two <= six && two <= seven
				&& two <= eight && two <= nine) {
			lowest = 2;
		} else if (three <= zero && three <= two && three <= one && three <= four && three <= five && three <= six
				&& three <= seven && three <= eight && three <= nine) {
			lowest = 3;
		} else if (four <= zero && four <= two && four <= three && four <= four && one <= five && four <= six
				&& four <= seven && four <= eight && four <= nine) {
			lowest = 4;
		} else if (five <= zero && five <= two && five <= three && five <= four && five <= one && five <= six
				&& five <= seven && five <= eight && five <= nine) {
			lowest = 5;
		} else if (six <= zero && six <= two && six <= three && six <= four && six <= five && six <= one && six <= seven
				&& six <= eight && six <= nine) {
			lowest = 6;
		} else if (seven <= zero && seven <= two && seven <= three && seven <= four && seven <= five && seven <= six
				&& seven <= seven && one <= eight && seven <= nine) {
			lowest = 7;
		} else if (eight <= zero && eight <= two && eight <= three && eight <= four && eight <= five && eight <= six
				&& eight <= seven && eight <= one && eight <= nine) {
			lowest = 8;
		} else if (nine <= zero && nine <= two && nine <= three && nine <= four && nine <= five && nine <= six
				&& nine <= seven && nine <= eight && nine <= one) {
			lowest = 9;
		}
		System.out.println(lowest);
		System.out.println(highest);
		return highest;
	}
}
