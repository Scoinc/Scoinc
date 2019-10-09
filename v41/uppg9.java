import java.util.Scanner;

public class uppg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tal = sc.nextInt();
		int times = 0;

		while (times != 10) {
			times++;
			System.out.println(tal * times);
		}
	}

}