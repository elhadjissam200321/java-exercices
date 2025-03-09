import java.util.Scanner;

public class Calculator{
   public static void main(String[] args){
       int a,b;
    
       Scanner s= new Scanner(System.in);
       System.out.println("Enter a number");
       a=s.nextInt();
        System.out.println("Enter a number");
        b=s.nextInt();
        System.out.println("addition: "+(a+b));
        System.out.println("substraction: "+(a-b));
        System.out.println("multiplication: "+(a*b));
        System.out.println("division: "+((float)a/b));
   
   }




}
