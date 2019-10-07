public class uppg5 {
	public static void main(String[] args) {
		int i = 100000;
		while (i > 0) {
			i--;
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}