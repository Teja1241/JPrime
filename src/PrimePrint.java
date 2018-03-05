import java.util.Scanner;

public class PrimePrint
 {

  public static void main(String args[])
  {
     
 System.out.println("Enter The N number");
 
 Scanner N = new Scanner(System.in);
 int Limit = N.nextInt();
 
System.out.println("Printing prime number from 2 to " + Limit);
 for(int number = 2; number<=Limit; number++)
 {
          if(isPrime(number)){
              System.out.println(number);
          }
      }

    }

    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false;
           }
        }
        return true; 
    }    
}
