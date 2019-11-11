import java.util.Scanner;

public class Methodlibrary {
	double g = 9.82;

	public static void main(String[] args) {
		FarenheitToKelvin();
		KelvinToCelcius();
		Velocity();
		Kinetic();
		Potential();
		Delta();
		Paparazzi();
		Pr0g();
		svTime();
		Work();
		vth();
		svtr();
	}

	public static void FarenheitToKelvin() {
		System.out.println("Skriv farenheit:");
		Scanner sc = new Scanner(System.in);
		double farenheit = sc.nextDouble();
		double celcius = (farenheit - 32) / 1.8;
		double kelvin = celcius + 273.15;
		System.out.println("Det blir " + kelvin + " grader kelvin. \n");
	}

	public static void KelvinToCelcius() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv kelvin:");
		double kelvin = sc.nextDouble();
		double celcius = kelvin - 273.15;
		System.out.println("Det blir " + celcius + " grader celcius. \n");
	}

	public static void Velocity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv km/h");
		double kmh = sc.nextDouble();
		double mps = kmh / 3.6;
		System.out.println("Det blir " + mps + " meter per sekund: \n");
	}

	public static void Kinetic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv massa och hastighet:");
		double mass = sc.nextDouble();
		double velocity = sc.nextDouble();
		double kinetic = mass * velocity;
		System.out.println("Objektet har en kinetisk energi av " + kinetic + "\n");
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
		double vth = 000000;
	}
	
	public static void svtr() {
		Scanner sc = new Scanner(System.in);
		
	}
}
