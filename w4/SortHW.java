import java.util.Scanner;

public class SortHW {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		boolean user = true;
		int l = 0;
		System.out.println("Type numbers, type somthing less than 0 to stop");
		for (int i = 0; i < numbers.length - 1; i++) {
			l++;
			int input =  sc.nextInt();
			if(input >= 0) {
			numbers[l] = input;}
			else {for (int k = l; k < numbers.length - 1; k++) {
				
			}
			break;}
		}
		
		boolean swapped = false;
		int tempn;
		
		/*	Randomizer
		 * for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10000);
		}*/

		do {
			swapped = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					tempn = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = tempn;
					swapped = true;
					// sparar tillfälligt värde av tal som ska flyttas
				}
			}
			System.out.println(java.util.Arrays.toString(numbers));
		} while (swapped);
	}
}