// Added comment to top of source file
/*
    Created by: Julius Peterson
    Created on: 11/20/2023
    Purpose: Enhance the Hangman application
 */
import java.util.Scanner;

public class JP_Wk14_ch14_ex2 {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}