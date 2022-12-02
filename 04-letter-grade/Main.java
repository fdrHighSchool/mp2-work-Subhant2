import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int marks[] = new int[1];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<1; i++) { 
           System.out.print("Enter Your Marks: ");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/1;
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
          else if(avg>=65 && avg<70)
      {
        System.out.print("D");
      }
        else
        {
            System.out.print("F");
        }
    }
}
