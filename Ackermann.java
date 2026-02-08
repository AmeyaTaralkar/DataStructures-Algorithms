import java.util.*;
public class Ackermann {
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter in a whole number (an integer)");
      String userStringInput = scan.nextLine();
      int userIntegerInput = Integer.parseInt(userStringInput);
      System.out.println("Enter in another whole number (an integer)");
      String userStringInput2 = scan.nextLine();
      int userIntegerInput2 = Integer.parseInt(userStringInput2);
            
      int integer = ackermannFunction(userIntegerInput, userIntegerInput2);
      
      if(integer = 0) {
         System.out.println(integer++);
      }
   }
   public static int ackermannFunction(int m, int n) {
      if(m = 0) {
         return n + 1;
      }
      else if(n = 0) {
         return ackermannFunction(m - 1, 1);
      }
      else {
         return ackermannFunction(m - 1, ackermannFunction(m, n -1));
      }
   }
}