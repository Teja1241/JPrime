import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FReaderTwo {

	public static void main(String[] args) throws IOException 
	{
   		
      
	try {
		 FileReader one = new FileReader("C:\\\\Users\\\\ABD\\\\Desktop\\\\Inheritance.txt");
		 
		 int i;
		 while ((i = one.read())!=-1)
			  System.out.print((char)i);
		 
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	finally {System.out.println("please close");
	}
	
    	  
	}

}
