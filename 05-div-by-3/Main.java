import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      int num;
      System.out.print("Is this number divided by 3: ");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num % 3 == 0) 
         System.out.println("Yes!"); 
      else 
         System.out.println("No!"); 
      
   }
}
