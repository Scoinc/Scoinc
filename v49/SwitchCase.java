import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int choice;

		System.out.println("Välkommen, välj ett alternativ:");
		System.out.println("1 = New game");
		System.out.println("2 = Load game");
		System.out.println("3 = Options");
		System.out.println("4 = Exit game");
		System.out.println("5 = Credits \n");

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\nSpelet startar... \n");
			break;
		case 2:
			System.out.println("\nVälj spel att starta \n");
			break;
		case 3:
			System.out.println("\nLjud \nvideo \nkontroller \n");
			break;
		case 4:
			System.out.println("\nStänger av... \n");
			break;
		case 5:
			System.out.println("\nDavid Utbult \n");
			break;

		default:
			System.out.println("\nfuck you \n");
			break;
		}
	}
}
