import java.util.Scanner;

public class Methodlibrary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv fahrenheit:");
		double fahrenheit = sc.nextDouble();
		System.out.println("Det blir " + (FahrenheitToKelvin(fahrenheit)) + " grader kelvin. \n");
		// Farenheit to kelvin

		System.out.println("Skriv kelvin:");
		double kelvin = sc.nextDouble();
		System.out.println("Det blir " + (KelvinToCelcius(kelvin)) + " grader celcius. \n");
		// Kelvin to celcius

		System.out.println("Skriv km/h");
		double kmh = sc.nextDouble();
		System.out.println("Det blir " + (Velocity(kmh)) + " meter per sekund: \n");
		// Omvandlar km/h till m/s

		System.out.println("Skriv massa och hastighet:");
		double mass = sc.nextDouble();
		double velocity = sc.nextDouble();
		System.out.println("Objektet har en kinetisk energi av " + (Kinetic(mass, velocity)) + "\n");
		// Räknar ut kinetisk energi när given massa och hastighet

		Potential();
		// Räknar ut potensiell energi när given massa och höjd

		Delta();
		// Räknar ut medelvärdet av 3 givna nummer

		Paparazzi();
		// Ändrar strängen "PaParaZZi" till "paparazzi"

		Pr0g();
		/*
		 * Ändrar strängen "Jag vill bli godkänd i programmering! <3" till JAG VILL BLI
		 * G0DKÄND I PR0GRAMMERING! <3
		 */

		svTime();
		// Räknar ut tid passerat när given en distans och medelhastighet

		Work();
		// Räknar ut arbete utfört när given en kraft och distans

		vth();
		//

		svtr();
		// Räknar ut radien av en sfär med en given volym

	}

	public static double FahrenheitToKelvin(double fahrenheit) {
		double celcius = (fahrenheit - 32) / 1.8;
		double kelvin = celcius + 273.15;
		return kelvin;
	}

	public static double KelvinToCelcius(double kelvin) {
		double celcius = kelvin - 273.15;
		return celcius;
	}

	public static double Velocity(double kmh) {
		double mps = kmh / 3.6;
		return mps;
	}

	public static double Kinetic(double mass, double velocity) {
		double kinetic = mass * velocity;
		return kinetic;
	}

	public static void Potential() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv massa och höjd: \n");
		double mass = sc.nextDouble();
		double height = sc.nextDouble();
		double potential = mass * height * 9.82;
		System.out.println("Objektet har en potentiell energi av " + potential + "\n");
	}

	public static void Delta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv 3 nummer:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double svar = (x + y + z) / 3;
		System.out.println("medelvärdet är " + svar + "\n");
	}

	public static void Paparazzi() {
		String word = "PaParaZZi";
		System.out.println((word.toLowerCase()) + "\n");
	}

	public static void Pr0g() {
		String word = "Jag vill bli godkännd i programmering! <3";
		System.out.println(word.toUpperCase().replace("o", "0") + "\n");
	}

	public static void svTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv hur långt du gick hur snabbt:");
		double distance = sc.nextDouble();
		double velocity = sc.nextDouble();
		double time = distance / velocity;
		System.out.println("Det tog " + time + " enheter av tid \n");
	}

	public static void Work() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv hur mycket kraft du använde hur långt:");
		double force = sc.nextDouble();
		double distance = sc.nextDouble();
		double work = force * distance;
		System.out.println("Du använde " + work + " enheter av kraft \n");
	}

	public static void vth() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv hastighet av objekt");
		double V = sc.nextDouble();
		double vth = 0;
	}

	public static void svtr() {
		Scanner sc = new Scanner(System.in);

	}
}
