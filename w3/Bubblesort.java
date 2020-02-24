import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		int[] numbers = { 51, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
				
		//int[] numbers = sc.next();
		
		boolean swapped = false;
		int tempn;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10000);
		}

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