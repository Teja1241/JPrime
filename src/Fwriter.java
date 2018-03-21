import java.io.FileWriter;
import java.io.IOException;

public class Fwriter {

	public static void main(String[] args) 
	{
	
		try {
			FileWriter a = new FileWriter("C:\\Users\\ABD\\Desktop\\Keshav\\Write.txt");
		
			a.write("hi this is my first file writer example");
	        
			a.close();
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
       
	}

}
