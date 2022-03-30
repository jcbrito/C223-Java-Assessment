
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan B
 */
public class RockPaperScissors {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Welcome to RPC. How many round would you like to play? (1 min 10 max): ");
        int rounds = in.nextInt();
        
        int ties = 0;
        int playerWins = 0;
        int compWins = 0;
        
        if(rounds < 1 || rounds > 10) {
            System.out.println("Invalid number of rounds. Goodbye");
            System.exit(0);
        }

        for(int i = 0; i < rounds; i++){
            
            System.out.print("Choose Rock(1), Paper(2), or Sciessors(3): ");
            
            int player = in.nextInt();
            int computer = rand.nextInt(3) + 1;
            String compChoice ="";
            
            //System.out.println(computer);
            
            HashMap<Integer, String> choices = new HashMap<Integer, String>();
            choices.put(1, "Rock");
            choices.put(2, "Paper");
            choices.put(3, "Scissors");
            System.out.println("You are: " + choices.get(player));
            System.out.println("Computer is: " + choices.get(computer));
            
            if(computer == player){
                System.out.println("Round " + (i+1 )+ " is a tie.");
                ties++;
            }
           

            else if((player == 1 && computer == 2) || (player == 2 && computer == 3)|| (player == 3 && computer == 1)){
                
                System.out.println("Round " + (i+1 )+ " computer Wins!");
                compWins++; 
            }
              
            else{
                System.out.println("Round " + (i+1 )+ " player Wins!");
                playerWins++; 
            }
            
            
        }
        
        System.out.println("\nPlayer wins: " + playerWins);
        System.out.println("Computer wins: " + compWins);
        System.out.println("ties: " + ties);

    }
    
}
