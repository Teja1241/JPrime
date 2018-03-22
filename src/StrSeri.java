import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StrSeri {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Streamng A = new Streamng("ABD", 32);// creating the ocject for student class

		FileOutputStream B = new FileOutputStream("C:\\Users\\ABD\\Desktop\\Keshav\\Stream.txt"); // as we doing in
																									// bytes have to use
																									// stream
		ObjectOutputStream C = new ObjectOutputStream(B);// to convert object into bytes have to use this

		C.writeObject(A);// writeing some language to the txt file

		System.out.println("serialization success");

		StrSeri.Deser();

	}

	public static void Deser() throws ClassNotFoundException
 {
	FileInputStream D;
	
	Streamng object1 = null;
	try {
		D = new FileInputStream("C:\\\\Users\\\\ABD\\\\Desktop\\\\Keshav\\\\Stream.txt");
		ObjectInputStream E = new ObjectInputStream(D);
		
		
		object1 = ((Streamng)E.readObject());
		
		
		System.out.println("name is " + object1.player);
		System.out.println("name is " + object1.age);
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally 
	{
		System.out.println("sds");
	}
	
	
 }

	private static void read(ObjectInputStream e) {
		// TODO Auto-generated method stub
		
	}

}
