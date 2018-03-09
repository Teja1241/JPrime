

public class FibCnstrC {

	public FibCnstrC(int a) {
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

	public FibCnstrC(double b) 
	{
		System.out.println("z is " + b);
	}

	/*
	 * public fibCnstr() { can i assagn constructor inside a contructor or a method.
	 * some times private constructor working what is the use of that
	 * private FibCnstrC() {
	 * 
	 * }
	 */

	public FibCnstrC(String g)
   {  
	  System.out.println("value of string is" + g);
	   
   }

	public static void main(String args[]) 
	{
		FibCnstrC z = new  FibCnstrC(100);
		FibCnstrC y = new  FibCnstrC(10.568);
		FibCnstrC x = new  FibCnstrC("string");
				
	}

}
		/* FibCnstrC f1 = new FibCnstrC(100);
		int y;
		FibCnstrC f2 = new FibCnstrC();*/
        /*int y
		y = Integer.parseInt(args[0]);
		System.out.println("value of args[0] " + y);

		// FibCnstrC f2 = new FibCnstrC();
		// FibMP f2 = new FibMP("");
		// FibMP.a=100;

	}
*/