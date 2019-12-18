
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

		System.out.println("Det finns " + sevens(numbers) + " sjuor \n"); // 1

		System.out.println("Det finns " + tom(names) + " personer som heter tom i listan \n"); // 2

		System.out.println("Det finns flest " + most(numbers) + "or \n"); // 3 most
		System.out.println("Det finns minst " + least(numbers) + "or \n"); // 3 least

		System.out.println("Drusilla är på den " + drusilla(names) + " platsen \n"); // 4

		System.out.println("Summan av alla jämna tal blir " + summa(numbers) + "\n"); // 5

		System.out.println(anTal(numbers) + "\n"); // 6

		System.out.println(L(names) + " Namn börjar på bokstaven L \n"); // 7

		System.out.println(femB(names) + " Namn är 5 bokstäver långa \n"); // 8

		System.out.println("Det finns " + unique(names) + " unika namn"); // 9

		// System.out.println(); uppgift 10

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

	public static int least(int[] numbers) {
		int least = 0;
		int ammount;
		int min = 99999;
		for (int i = 0; i < 10; i++) {
			ammount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					ammount++;
				}
			}
			if (ammount < min) {
				least = i;
				min = ammount;
			}

		}
		return least;
	}

	public static int most(int[] numbers) {
		int flest = 0;
		int ammount;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			ammount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					ammount++;
				}
			}
			if (ammount > max) {
				flest = i;
				max = ammount;
			}

		}
		return flest;
	}

	public static int drusilla(String[] names) {
		int drusilla = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Drusilla")) {
				drusilla = i;
				break;
			}
		}
		return drusilla;
	}

	public static int summa(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		return sum;
	}

	public static String anTal(int[] numbers) {
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
				zero++;
			} else if (numbers[i] == 1) {
				one++;
			} else if (numbers[i] == 2) {
				two++;
			} else if (numbers[i] == 3) {
				three++;
			} else if (numbers[i] == 4) {
				four++;
			} else if (numbers[i] == 5) {
				five++;
			} else if (numbers[i] == 6) {
				six++;
			} else if (numbers[i] == 7) {
				seven++;
			} else if (numbers[i] == 8) {
				eight++;
			} else {
				nine++;
			}
		}
		String antal = "Antal nollor: " + zero + "\nAntal ettor: " + one + "\nAntal tvåor: " + two + "\nAntal treor: "
				+ three + "\nAntal fyror: " + four + "\nAntal femmor: " + five + "\nAntal sexor: " + six
				+ "\nAntal sjuor: " + seven + "\nAntal åttor: " + eight + "\nAntal nior: " + nine;
		return antal;
	}

	public static int L(String[] names) {
		int L = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("L")) {
				L++;
			}
		}

		return L;
	}

	public static int femB(String[] names) {
		int five = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				five++;
			}
		}
		return five;
	}

	static int unique(String[] names) {
		int unique = 1;

		for (int i = 1; i < names.length; i++) {
			int j = 0;
			for (j = 0; j < i; j++)

				if (names[i] == names[j]) {
					break;
				}

			if (i == j)
				unique++;
		}
		return unique;
	}
}
