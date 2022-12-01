import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      int Num;
      System.out.print("Enter a Number: ");
      Scanner sc = new Scanner(System.in);
      Num = sc.nextInt();

      if ((Num % 3 == 0) && (Num % 5 == 0))
         System.out.println("This is a FizzBuzz");
      else if  (Num % 3 == 0)
         System.out.println("This is a Fizz");
     else if (Num % 5 == 0)
       System.out.println("This is buzz");
     else 
     System.out.println(Num);
   }
}
