import java.util.Scanner;

public class VisualNovel {

	
	public static void main(String[] args) {
		Novel();
	}
	
	public static void Novel() {

		int choice;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("(1) Good morning");
		System.out.println("(2) What are you doing in my house?");
		System.out.println("(3) ...");
		System.out.println("(4) Restart\n");
		

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			choice1();
			break;
		case 2:
			//choice2();
			break;
		case 3:
			//choice3() "..."
			break;
		case 4:
			Novel();
			break;

		default:
			System.out.println("\nfuck you");
			break;
		}
	}

	public static String choice1() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("\nGood morning, how you doin'\n");

		System.out.println("(1) Doing well, you?");
		System.out.println("(2) I'm hungry, you wanna go eat something?");
		System.out.println("(3) *Scream*");
		System.out.println("(4) Restart\n");

		int choice = sc.nextInt();

		String choice1 = "";

		switch (choice) {
		case 1:
			choice1 = "\nGood morning, how you doin'\n";
			System.out.println(choice11());
			break;
		case 2:
			choice1 = "\nYea sure, where you wanna go?\n";
			System.out.println(choice12());
			break;
		case 3:
			choice1 = "\nwhat\n";
			System.out.println(choice13());
			break;
		case 4:
			Novel();
			break;

		default:
			System.out.println("\nfuck you");
			break;
		}

		return choice1;
	}

	public static String choice11() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//"\nGood morning, how you doin'\n"

		System.out.println("(1) ");
		System.out.println("(2) ");
		System.out.println("(3) ");

		int choice = sc.nextInt();

		String choice1 = "";

		switch (choice) {
		case 1:
			choice1 = "\nGood morning, how you doin'\n";
			break;
		case 2:
			choice1 = "\nVad menar du, det här är mitt hus\n";
			break;
		case 3:
			choice1 = "\nVälj spel att starta \n";
			break;

		default:
			System.out.println("\nfuck you");
			break;
		}

		return choice1;
	}

	public static String choice12() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//Yea sure, where you wanna go?

		System.out.println("(1) Doing well, you?");
		System.out.println("(2) ");
		System.out.println("(3) *Scream*");

		int choice = sc.nextInt();

		String choice1 = "";

		switch (choice) {
		case 1:
			choice1 = "\nGood morning, how you doin'\n";
			break;
		case 2:
			choice1 = "\nVad menar du, det här är mitt hus\n";
			break;
		case 3:
			choice1 = "\nVälj spel att starta \n";
			break;

		default:
			System.out.println("\nfuck you");
			break;
		}

		return choice1;
	}

	public static String choice13() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//what

		System.out.println("(1) ");
		System.out.println("(2) ");
		System.out.println("(3) *Continue screaming*");

		int choice = sc.nextInt();

		String choice1 = "";

		switch (choice) {
		case 1:
			choice1 = "\nGood morning, how you doin'\n";
			break;
		case 2:
			choice1 = "\nVad menar du, det här är mitt hus\n";
			break;
		case 3:
			choice1 = "\n-Bad ending-\n";
			break;

		default:
			System.out.println("\nfuck you");
			break;
		}

		return choice1;
	}
}