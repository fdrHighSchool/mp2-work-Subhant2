import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
   int cents;
  Scanner stdio = new Scanner( System.in );
      double quarters;
      System.out.print("Enter the number of Cents: ");
      cents = stdio.nextInt();
      stdio.nextLine();
      quarters = (cents / 25);
      System.out.println();
      System.out.print("The total Quarter in cents are: ");
       System.out.printf("%1.2f",quarters);
      System.out.println();
   }
} 
