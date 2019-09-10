package v37;

import java.util.Scanner;

public class tenthofseptember {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //resource leak?

		String namn1 = "David Utbult";
		String namn2 = "Bomas Beis";
		String namn3 = "Leffe Ohlsson";
		
		System.out.println("skriv ett namn: ");
		
		String namn4 = input.nextLine();
		
		System.out.println("skriv ett namn: ");
		
		String namn5 = input.nextLine();
		
		

		System.out.println("\nNAMN:" + "\n" + namn1 + "\n" + namn2 + "\n" + namn3 + "\n" + namn4 + "\n" + namn5);
		
	}

}
