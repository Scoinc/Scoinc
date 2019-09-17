import java.util.Scanner;

public class mondayv37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("hur gammal du?");
		
		age = input.nextInt();
		
		if (age >= 18) {
		System.out.println("myndig man");
		}
		
		else if (age >= 14 && age <= 18) {
			System.out.println("ung man men moppe");
		}
		
		else {
			System.out.println("bara ung man");
		}
		
	}

}
