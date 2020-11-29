
package rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    
   static boolean Playing = true;
    
    
    
    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);
        
                System.out.println("Welcome to Rock Paper Scissors! Your Objective is to beat the opponent!");   
        System.out.println("I will assume you are familiar with the rules. If you are, Input '1'. if you need to see them. input '2'");
        int rules = start.nextInt();
       
        if (rules == 2) {
            System.out.println("A player who decides to play rock will beat another player who has chosen scissors");
            System.out.println("but will lose to one who has played paper");           
            System.out.println("a play of paper will lose to a play of scissors");}else{
            System.out.println("Okay, so you are already up to speed. lets Continue");
        }
        
        
        play();
        
    }
     public static void play() {  
        
         while(Playing) {
         
         
     Scanner inp = new Scanner(System.in);   
     Random bot = new Random();
       

        

        

         int rand = bot.nextInt(3)+1;
      
        
        
        System.out.println("Please choose between the following. Rock,Paper, or scissors.:");
        String choice = inp.next();
               
        if ("Rock".equalsIgnoreCase(choice)){
            System.out.println("Rock Selected");                
            double select = 1;
            
            if(rand == select){
                System.out.println("You Both Threw Rock!");
                System.out.println("No one wins");
            }
            
            if (rand == 2){
                System.out.println("The opponent Threw Paper"); 
                System.out.println("You Lose");
                 double i = 1;     
                 double j = 0;
                System.out.println("Your score: " + j + "The opponents score : " + i);            
            }
            
            if (rand == 3){
                System.out.println("The Oppenent Threw Scissors");
                System.out.println("You Win!");
                double j = 1;
                double i = 0;
                System.out.println("Your score: " + j + "The opponents score : " + i);
                        }
            
        
        }
        if ("Paper".equalsIgnoreCase(choice)){
            System.out.println("Paper Selected");                
                
            double select =2;
            
            if(rand == select){
                System.out.println("You Both Threw Paper!");
                System.out.println("No one wins");            
            
            }
            if(rand == 1){
                System.out.println("the Opponent Threw Rock!");
                System.out.println("You Win");
            }
            
            if(rand == 3) {
                System.out.println("The opponent threw Scissors");
                System.out.println("You lose!");
            }
            
        }
        if ("Scissors".equalsIgnoreCase(choice)){
            System.out.println("Scissors Selected");
            
            double select = 3;
            
            if(rand == select){
                System.out.println("You both Threw Scissors");
                System.out.println("No one wins");
            }
              
            if(rand == 1){
                System.out.println("the opponent threw Rock");
                System.out.println("You lose!");
            }
            if (rand == 2){
                System.out.println("The opponent threw Paper");
                System.out.println("You Win1");
            }
            

            
        }
        if(!"Rock".equalsIgnoreCase(choice)&&!"Paper".equalsIgnoreCase(choice)&&!"Scissors".equalsIgnoreCase(choice)){
            System.out.println("Sorry, that input was not correct, please restart the program.");
        }        
  

   
        
         
        
 
      Scanner nun = new Scanner(System.in);   
         
    System.out.println("Do you wish to play again? Y/N");
    String answer = nun.nextLine();
    Playing = answer.equalsIgnoreCase("y");        
        
         }
    

            
     }    
        
        
}    
        
        
        
    
    
    
    

