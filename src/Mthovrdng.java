

/* this program is for static keyword, accessmodifiers, overloading, overriding(polymorphism), inheritance*/

public class Mthovrdng extends  MethOvrldngrdngnstatc

{
	public static void testOvrrdng()
	
	{
		int a = 25;
		
		int b = 35;
		
		MethOvrldngrdngnstatc.z = 20;  // using static variable of other class
		
		z= a*b/z;

		System.out.println("a*b/z" + z);   // overriding polymorphism
		
	}
     
	
	private static void ex()
	{
		
		Integer y = null;
		System.out.println("val is " + y);
	}
    
	public static void main(String[] args) 
	{
		MethOvrldngrdngnstatc one = new MethOvrldngrdngnstatc();
		
		one.add();
		
		MethOvrldngrdngnstatc two = new MethOvrldngrdngnstatc();
		
		two.add(10);
		
		MethOvrldngrdngnstatc.add(25,45);  // using static method without creating an object
		
		
		MethOvrldngrdngnstatc.testOvrrdng(); // static method
		
		MethOvrldngrdngnstatc.testOvrrdng();
		
		//MethOvrldngrdngnstatc exm = new Mthovrdng();
		
		Mthovrdng.ex();
		
	}

	
}
