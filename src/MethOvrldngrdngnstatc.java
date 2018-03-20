

/* this program is for static keyword, accessmodifiers, overloading, overriding(polymorphism), inheritance*/

public class MethOvrldngrdngnstatc 

  {
     static int z;
	 protected void add()
	 {
		 int a =10;
		 int b=20;
		 int c = a+b;
		 System.out.println("is  " + c);
	 }
	
     protected void add(int a)
     {
    	 System.out.println("is  "  + a);
     }
	
     protected static void add(int a, int b)  //overloading
     {
    	 int c = a*b;
    	 System.out.println("is  " + c);
     }
	
     public static void testOvrrdng()
     {
    	 int a= 10;
    	 int b =20;
    	 int c = a+b;
    	 System.out.println("is  " + c);
     }
     
}
