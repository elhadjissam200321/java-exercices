import java.util.Scanner;

public class Odd-even_number{
   public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          double num;
          System.out.println("Enter a number : ");
          num=s.nextDouble();
          if(num%2==0){
              System.out.println("Number " +num+" Is even");
          }else{
              System.out.println("Number " +num +" Is odd");
          }
                  
            

   }

}
