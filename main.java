import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        
        int turnsCount = 0;
        
     for(int i = 0; i<=5; i++){
      System.out.println("**************************************************");
      
      turnsCount ++;
      System.out.println("Turns: "+turnsCount);
      
      if(turnsCount%2 == 0){
                System.out.println("Player 2's turn");
      }
      else{
          
                System.out.println("Player 1's turn");

      }
      
      String linea = "a | _ | _ | _ |";
      String lineb = "b | _ | _ | _ |";
      String linec = "c | _ | _ | _ |";
      
      System.out.println("    1   2   3");
      System.out.println(linea);
      System.out.println(lineb);
      System.out.println(linec);
      
      System.out.println("Type the position that you want to play");
      
       Scanner scannerForLine = new Scanner(System.in);
   
        char lineChosen = scannerForLine.next().charAt(0);
        char columnChosen = scannerForLine.next().charAt(0);
   
        System.out.println("Line: "+lineChosen);
        System.out.println("Line: "+columnChosen);
      
     }
    }
}
