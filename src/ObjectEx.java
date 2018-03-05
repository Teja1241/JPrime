
public class ObjectEx 
{
	
	int i=10; //object variable
	
	public static int n=99;
	private static int j=25;
	protected static int s = 10;
	
	
	public static int temp() 
	{
	 int g =25;
	 System.out.println("int g is" + g);
	 return (g);
	}
	
		
	public static void main(String args[]) 
	{
		ObjectEx A = new ObjectEx();// Creating an object for the class
		System.out.println("Object variable is" + A.i);
		int y=29;
		
		System.out.println("This is "+" " + ObjectEx.n); //static variable in object level 

		ObjectEx.temp();  // calling object method in object level

		
		
			
	}
}