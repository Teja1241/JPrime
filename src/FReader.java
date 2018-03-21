import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FReader {  
    public static void main(String args[]) throws IOException 
    {    
          FileReader fr=new FileReader("C:\\Users\\ABD\\Desktop\\Inheritance.txt");    
          
          int i;    
          
          while((i=fr.read())!=-1)    
          
          System.out.print((char)i);    
              
          fr.close();    
    }    
}    