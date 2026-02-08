import java.util.*;
public class diamondPrinter {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a whole number: ");
      String input = scan.nextLine();
      int intInput = Integer.parseInt(input);
      diamondPrinter(intInput, 1);
   }
   
   public static void diamondPrinter(int input, int count) { // example: Plug in 3 for input. The input variable is the largest row of X's which make up the diamond.
      if(count <= input) { // if count (1) <= input (3) The code shown below will print out the top half of the diamond
         printX(input - count, count);
         diamondPrinter(input, count + 1); // recursion which calls diamondPrinter (itself) and returns the values: input and count + 1 every time.
      } // The code below will print out the bottom half of the diamond after the top diamond has been printed
      else if((count > input) && (count < 2 * input)) {
         printX(count - input, (2 * input - count));
         diamondPrinter(input, count + 1);
      }
   }
   
   public static void printX(int input, int count) { // A separate method which will have for loops used to print out the x's properly
      for(int i = 0; i < input; i++) { // A for loop that goes through the input and will print out spaces when i is not equal to the input (the largest number of diamonds) 
         System.out.print(" ");
      }
      for(int i = 0; i < count; i++) {
         System.out.print("x "); // Another for loop that goes through the input that will print out the x's whenever the count i
      }
      System.out.println(); // after one row of the diamond has been printed, it will move onto the next row
   }
}