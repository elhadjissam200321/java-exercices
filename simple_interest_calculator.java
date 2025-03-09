import java.util.Scanner;

public class Simple_interest_calculator{
   public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          double principal,rate,time,interest;
          System.out.println("Enter principal amount :");
          principal=s.nextDouble();
          System.out.println("Enter rate of interest :");
          rate=s.nextDouble();
          System.out.println("Enter Time in years");
          time=s.nextDouble();
          interest=(principal*rate*time)/100;
          System.out.println("Interest is :"+interest);
          
             

   }

}
