import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tal = 0;
		int times = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett tal 1-10");
		
		tal = input.nextInt();
		
		for (int i = tal; i < tal*10;) {
			i = tal*times;
			System.out.println(i);
			times++;
		}
	}
}
