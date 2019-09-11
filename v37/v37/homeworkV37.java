	package v37;

import java.util.Scanner;

public class homeworkV37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //no clue why as to the resource leak
		
		System.out.println("Vad är ditt namn?");
		
		String name = input.nextLine();
		
		System.out.println("\nHur gammal är du?");
		
		String age = input.nextLine();
		
		System.out.println("\nVad är din adress?");
		
		String adress = input.nextLine();
		
		System.out.println("\nVad är ditt postnummer?");
		
		String postn = input.nextLine();
		
		System.out.println("\nVilken stad bor du i?");
		
		String city = input.nextLine();
		
		System.out.println("\nVad är ditt telefonnummer?");
		
		String phone = input.nextLine();
		
		System.out.println("\n" + "Information:" + "\n" + "Namn:	" + name + "\n" + "Ålder:	" + age + "\n" + "Adress:	" + adress + "\n" + "	" + postn + " "+ city + "\n" + "Telefon:" + phone);
		

	}

}
