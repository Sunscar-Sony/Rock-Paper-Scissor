import java.util.Scanner;
import java.util.Random;

public class Game
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        String[] Choices={"rock","paper","scissor"};

        while(true)
        {
            System.out.println("Enter your Choice Rock, Paper, Scissor or Quit :");
            String UserChoice=input.nextLine().toLowerCase();
            System.out.println("Your Choice is :"+ UserChoice);
            if(UserChoice.equals("quit"))
            {
                System.out.println("Thanks For Playing...");
                break;
            }
            else
            {
                if(!UserChoice.equals("rock")&&!UserChoice.equals("paper")&&!UserChoice.equals("scissor")&&!UserChoice.equals("quit"))
                {
                    System.out.println("Invalid Choice!");
                    continue;
                }
                int computerIndex=random.nextInt(3);
                String ComputerChoice=Choices[computerIndex];
                System.out.println("Computer Choice is :"+ ComputerChoice+"\n");

                if(UserChoice.equals(ComputerChoice))
                {
                    System.out.println("Result : TIE");
                }
                else if((UserChoice.equals("rock") && ComputerChoice.equals("scissors")) ||
                (UserChoice.equals("paper") && ComputerChoice.equals("rock")) ||
                (UserChoice.equals("scissors") && ComputerChoice.equals("paper")))
                {
                    System.out.println("Result : YOU WIN !");
                }
                else
                {
                    System.out.println("Result : YOU LOOSE...");
                }
            }
        }
    }
}