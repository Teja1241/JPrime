

public class ExOb  {

	public void main(String args[])
	
	{
		
	int c = ObjectEx.n; // calling static value of n from other class
	System.out.println("value of static n of other class is " + c);	
	
	
	ObjectEx Obj = new ObjectEx(); // creating an object for other class object level variable
	System.out.println("the value of obj is " + Obj.i);
	
	
	int a = ObjectEx.s; // defining protected value from other class
	System.out.println("Protected variable value from other class in the same package" + a);
	
	ObjectEx.temp(); // accessing static method from other class from same package
	
	
	
	
	
	
	
	/*System.out.println("tshdsi " + ObjectEx.j);  Tried to
	 acess j variable which is defined in ObjectEx class but comes up with an 
	 error like j is not visible */
	
	
	}

}
