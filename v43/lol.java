import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LOL();
		max();
		count();
		kelvin();
		farenheit();
		agecontrol();
		stairs();

	}

	public static void LOL() {
		System.out.println("HAHAHAHAHAHAHAHAHAHAH");
	}

	public static void max() {
		System.out.println("Skriv 2 tal");
		Scanner sc = new Scanner(System.in);

		int tal1 = sc.nextInt();
		int tal2 = sc.nextInt();
		if (tal1 > tal2) {
			System.out.println(tal1 + " �r st�rre \n");
		} else {
			System.out.println(tal2 + " �r st�rre \n");
		}
	}

	public static void count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv ett tal");
		int n = sc.nextInt();
		while (n > 0) {
			System.out.println(n);
			n--;
		}
		System.out.println("\n");
	}

	public static void kelvin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv ett tal:");
		double celcius = sc.nextDouble();
		celcius -= 273.15;
		System.out.println("det blir " + celcius + " grader celcius \n");
	}

	public static void farenheit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv ett tal:");
		double farenheit = sc.nextDouble();
		farenheit = (farenheit - 32) / 1.8;
		System.out.println("Det blir " + farenheit + " grader celcius \n");
	}

	public static void agecontrol() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv din �lder:");
		int age = sc.nextInt();
		if (age >= 0 && age <= 5) {
			System.out.println("Sm�barn f�r inte g�ra n�got \n");
		}
		if (age >= 6 && age <= 12) {
			System.out.println("Du f�r spela fortnite \n");
		}
		if (age >= 13 && age <= 14) {
			System.out.println("Du �r ton�ring \n");
		}
		if (age >= 15 && age <= 17) {
			System.out.println("Du f�r k�ra moppe \n");
		}
		if (age >= 18 && age <= 20) {
			System.out.println("Du f�r k�ra bil \n");
		}
		if (age >= 21 && age <= 64) {
			System.out.println("Du f�r f�ngelse f�r ajaj \n");
		}
		if (age >= 65 && age <= 99) {
			System.out.println("Du �r pension�r \n");
		}
		if (age >= 100 || age < 0) {
			System.out.println("F in the chat bois \n");
		}
	}

	public static void stairs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv din �lder:");
		int steps = sc.nextInt();
		int step;
		for (int i = 1; i <= steps; i++) {

			step = steps - i;
			for (int j = 0; j < steps; j++) {
				if (j < step) {
					System.out.print(" ");
				} else {
					System.out.print("X");

				}
			}
			System.out.println();
		}
	}
}
