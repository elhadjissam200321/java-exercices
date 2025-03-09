import java.util.Scanner;

public class Area-perimeter_rectangle{
   public static void main(String[] args){
          Scanner s=new Scanner(System.in);
            double w,l,perimeter,area;
            System.out.println("Enter width: ");
            w=s.nextDouble();
            System.out.println("Enter length: ");
            l=s.nextDouble();
            perimeter=2*l + 2*w;
            area=l*w;
            System.out.println("Area of rectangle : "+area);
            System.out.println("Perimeter of rectangle : "+perimeter);
                  
            

   }

}
