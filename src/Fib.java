
public class Fib
{
  int a = 500;

  public void fib()
  {
	  int n1=1;
	  int n2=1;
	  int n3;
	  System.out.print(n1+ " "+ n2);
	  Fib g = new Fib();
	  for(int i=3; i<g.a; i++)
	  {
	  n3=n1+n2;
	  if(n3>g.a)
	  {
		  break;
	  }
	  n1=n2;
	  n2=n3;
	  System.out.print(" " +n3);  
	  
      }
  }
  public static void main(String[] args)
	{
	  Fib f = new Fib();
	  f.fib();
	  
	}
}
