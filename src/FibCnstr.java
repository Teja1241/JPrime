
import java.util.Scanner;

public class FibCnstr extends Cunster {
	static int a = 100; // if this value is not static

	private void fib(int a) {
		int n1 = 1;
		int n2 = 1;
		int n3;

		System.out.print(n1 + " " + n2);

		for (int i = 3; i < a; i++) {
			n3 = n1 + n2;
			if (n3 > a) {
				break;
			}
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);

		}

	}

	public static void main(String args[]) {
		FibCnstr f1 = new FibCnstr();
		f1.fib(a);

		Cunster n = new Cunster();
		Cunster m = new Cunster(10);
		Cunster s = new Cunster(25, 15);

		// FibMP f2 = new FibMP("");
		// FibMP.a=100;

	}
}
