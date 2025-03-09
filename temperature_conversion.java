import java.util.Scanner;

public class Temperature_conversion{
   public static void main(String[] args){
       double fahrenheit,celsius;
    
     Scanner s=new Scanner(System.in);
     System.out.println("Enter celsius:");
    celsius=s.nextDouble();
    fahrenheit=(celsius * 9/5) + 32 ;
    System.out.println("Fahrenheit: "+fahrenheit);
   }

}
