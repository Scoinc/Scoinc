import java.util.Scanner;

public class Methodlibrary {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
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

		System.out.println("Skriv massa och höjd: \n");
		double mass2 = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Objektet har en potensiell energi på " + (Potential(mass2, height)) + "\n");
		// Räknar ut potensiell energi när given massa och höjd

		System.out.println("Skriv 3 nummer:");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		System.out.println("Medelvärdet är " + (Delta(x, y, z)) + "\n");
		// Räknar ut medelvärdet av 3 givna nummer

		String word = "PaParaZZi";
		System.out.println((Paparazzi(word)) + "\n");
		// Ändrar strängen "PaParaZZi" till "paparazzi"

		String word2 = "Jag vill bli godkännd i programmering! <3";
		System.out.println((Pr0g(word2)) + "\n");
		/*
		 * Ändrar strängen "Jag vill bli godkänd i programmering! <3" till JAG VILL BLI
		 * G0DKÄND I PR0GRAMMERING! <3
		 */

		System.out.println("Skriv hur långt du gick hur snabbt:");
		double distance = sc.nextDouble();
		double velocity2 = sc.nextDouble();
		System.out.println("Det tog " + (svTime(distance, velocity2)) + " enheter av tid \n");
		// Räknar ut tid passerat när given en distans och medelhastighet

		System.out.println("Skriv hur mycket kraft du använde hur långt:");
		double force = sc.nextDouble();
		double distance2 = sc.nextDouble();
		System.out.println("Du använde " + (Work(force, distance2)) + " enheter av kraft \n");
		// Räknar ut arbete utfört när given en kraft och distans

		System.out.println("Skriv hastighet av objekt");
		double V = sc.nextDouble();
		System.out.println("Objektet får en höjd av " + (vth(V)) + " höjdenheter. \n");
		// Känns riktigt onödig men delar hastighet på 2 för att få ut höjd

		System.out.println("Skriv volymen på sfären");
		double volume = sc.nextDouble();
		System.out.println("Sfären har en radie på " + (svtr(volume)) + " längdenheter \n");
		// Räknar ut radien av en sfär med en given volym

		System.out.println("Hur mycket rp har du köpt på det senaste?");
		double rp = sc.nextDouble();
		System.out.println("Det kostade dig " + (rptocash(rp)) + " euro om du köpte det dyraste packet \n");
		// Räknar ut hur mycket det har kostat dig att köpa ett antal RP (league of
		// legends 'riot points')

		System.out.println("Hur mycket har du spelat ett spel och hur mycket kostade det?");
		double playtime = sc.nextDouble();
		double money = sc.nextDouble();
		System.out.println("Spelet har kostat dig " + (cashtoplaytime(playtime, money)) + "pengar per enhet av tid");
		// Räknar ut kostnaden per timma av ett spel givet hur mycket du har spelat det
		// och hur mycket du har spelat det
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

	public static double Potential(double mass2, double height) {

		double potential = mass2 * height * 9.82;
		return potential;
	}

	public static double Delta(double x, double y, double z) {
		double svar = (x + y + z) / 3;
		return svar;
	}

	public static String Paparazzi(String word) {
		word = word.toLowerCase();
		return word;
	}

	public static String Pr0g(String word2) {
		word2 = word2.toUpperCase().replace("o", "0");
		return word2;

	}

	public static double svTime(double distance, double velocity2) {
		double time = distance / velocity2;
		return time;
	}

	public static double Work(double force, double distance2) {
		double work = force * distance2;
		return work;
	}

	public static double vth(double V) {
		double vth = V / 2;
		return vth;
	}

	public static double svtr(double volume) {
		double radius = Math.cbrt((3 * (volume / (4 * Math.PI))));
		return radius;
	}

	public static double rptocash(double rp) {
		double cash = rp / 144;
		return cash;
	}

	public static double cashtoplaytime(double money, double playtime) {
		double value = playtime / money;
		return value;
	}
}
