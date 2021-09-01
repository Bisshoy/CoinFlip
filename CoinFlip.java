import java.util.*;

public class CoinFlip {
   public static void main(String[] args) {
      Random randGen = new Random(); 
      Scanner enter = new Scanner(System.in);

      System.out.println("Press ENTER to flip the coin!"); 
      
      String a = enter.nextLine();
      System.out.print(a);

      int result = randGen.nextInt(2);
      
      if (result == 0) {
         System.out.println("HEADS!");
      }

      else {
         System.out.println("TAILS!");
      }
      
      enter.close();
   }
}