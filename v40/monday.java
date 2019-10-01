
public class monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * % == modulus == rest den delar talet på en siffra och tar ut och skriver
		 * resten
		 */

		int tal1 = 48;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
				System.out.println("talet " + i + " är delbart med 3");
			}
		}
		System.out.println("totala summan: " + sum);

		int turn = 0;

		while (true) {

			turn++;

			if (turn % 3 == 0) {
				System.out.println("Leffes tur");
			}

			else if (turn % 3 == 1) {
				System.out.println("Jacobs tur");
			}

			else if (turn % 3 == 2) {
				System.out.println("Gabbes tur");
			}

			if (turn >= 100) {
				break;
			}
		}
		System.out.println("stop time");
	}
}
