import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> nameList = new ArrayList<String>();

		nameList.add("Bomas"); // Index 0
		nameList.add("Better"); // Index 1
		nameList.add(1, "Bacob"); // Lägger Bacob på index 1 och flyttar Better till Index 2

		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i)); // Hämtar plats i och skriver ut det i en loop
		}

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			numbers.add(i * i);
		}

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println(numbers);
	}
}
