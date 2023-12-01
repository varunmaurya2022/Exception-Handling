public class MultipleCatch // This program shows Compilation Error:Exception has allready been caught.
{
	public static void main(String... args) {
		try {
			int x = 10 / 2;
			System.out.println(x);
		} catch (Exception e) { // Parent Exception
			System.out.println(e);

		} catch (ArithmeticException e) { // Child Exception
			System.out.println(e);
		}

	}
}