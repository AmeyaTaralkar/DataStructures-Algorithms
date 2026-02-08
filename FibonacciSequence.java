import java.util.*;
// THIS PROGRAM WILL PRINT OUT THE Nth FIBONNACI NUMBER USING RECURSION
public class FibonacciSequence {
   public static void main(String[] args) {
      // Scanner scan = new Scanner(System.in);
//       System.out.print("Enter a positive number: ");
//       String input = scan.nextLine();
//       int numInput = Integer.parseInt(input);
   System.out.println(fibonacci(10));
   }
   public static int fibonacci(int n) {
      if(n == 1 || n == 2) {
         return 1;
      }
      else {
         return fibonacci(n - 1) + fibonacci(n - 2);
      }
   }
}