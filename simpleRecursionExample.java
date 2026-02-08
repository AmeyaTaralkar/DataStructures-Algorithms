import java.util.*;
public class simpleRecursionExample {
   public static void main(String args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number (n) which will be the last number added from 1 + 2 + 3 + n");
      String input = scan.nextLine();
      int n = Integer.parseInt(input);
      int sum = addition(n);
      scan.close();
   }
      public static int addition(int n) {
      if(n <= 0) {
         return 0;
      }
      else {
         return n + addition(n - 1);
      }
   }
}