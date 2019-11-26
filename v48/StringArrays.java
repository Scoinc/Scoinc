
public class StringArrays {

	public static void main(String[] args) {

		String[] namn = { "bavid", "bacob", "bachris", "bandreas" };

		for (int i = 0; i < 40; i++) {

			for (int j = 0; j < namn.length; j++) {

				i += j;
				System.out.println((i) + ". " + namn[j]);
			}
		}
	}
}
