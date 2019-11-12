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
		// R�knar ut kinetisk energi n�r given massa och hastighet

		Potential();
		// R�knar ut potensiell energi n�r given massa och h�jd

		Delta();
		// R�knar ut medelv�rdet av 3 givna nummer

		Paparazzi();
		// �ndrar str�ngen "PaParaZZi" till "paparazzi"

		Pr0g();
		/*
		 * �ndrar str�ngen "Jag vill bli godk�nd i programmering! <3" till JAG VILL BLI
		 * G0DK�ND I PR0GRAMMERING! <3
		 */

		svTime();
		// R�knar ut tid passerat n�r given en distans och medelhastighet

		Work();
		// R�knar ut arbete utf�rt n�r given en kraft och distans

		vth();
		//

		svtr();
		// R�knar ut radien av en sf�r med en given volym

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
		System.out.println("Skriv massa och h�jd: \n");
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
		System.out.println("medelv�rdet �r " + svar + "\n");
	}

	public static void Paparazzi() {
		String word = "PaParaZZi";
		System.out.println((word.toLowerCase()) + "\n");
	}

	public static void Pr0g() {
		String word = "Jag vill bli godk�nnd i programmering! <3";
		System.out.println(word.toUpperCase().replace("o", "0") + "\n");
	}

	public static void svTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv hur l�ngt du gick hur snabbt:");
		double distance = sc.nextDouble();
		double velocity = sc.nextDouble();
		double time = distance / velocity;
		System.out.println("Det tog " + time + " enheter av tid \n");
	}

	public static void Work() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv hur mycket kraft du anv�nde hur l�ngt:");
		double force = sc.nextDouble();
		double distance = sc.nextDouble();
		double work = force * distance;
		System.out.println("Du anv�nde " + work + " enheter av kraft \n");
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
