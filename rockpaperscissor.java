import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main (String[] args){
          Scanner scanner=new Scanner(System.in); 
          Random random=new Random();

          String[] choices={"rock","paper","scissor"};
          String playerChoice;
          String computerChoice;
          String playAgain="yes";

          do{
             System.out.println("Enter your move (rock,paper,scissor): ");
             playerChoice= scanner.nextLine().toLowerCase().trim();

         if(!playerChoice.equals("rock")
            &&!playerChoice.equals("paper")
            &&!playerChoice.equals("scissor")){
                System.out.println("Invalid choice");
                continue;
         }
            computerChoice=choices[random.nextInt(3)];
            System.out.println("Computer choice: "+computerChoice);
            
            if(playerChoice.equals(computerChoice)){
                System.out.println("its a tie");
            }
            else if((playerChoice.equals("rock")&&computerChoice.equals("scissor"))
                ||(playerChoice.equals("paper")&&computerChoice.equals("rock"))
                ||(playerChoice.equals("scissor")&&computerChoice.equals("paper"))){
                    System.out.println("You win!");
            }
            else{
                    System.out.println("You lose:(");
            }
            System.out.print("Play again(Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase().trim();     
          }while(playAgain.equals("yes"));
          
          System.out.print("Thanks for playing");
          scanner.close();
    }
 }

