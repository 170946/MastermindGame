import java.util.Scanner;
public class MastermindGame
{
    public static void main(String args[])
    {
       Scanner input = new Scanner(System.in);
       Config trueConfig = new Config();
       int testForFail = 0;
       
        for (int j = 0; j < 12; j++)
        {
            System.out.print("Your guess? Please enter your answer as 4 integers, separated by spaces. ");
            int guessA = input.nextInt(); int guessB = input.nextInt(); int guessC = input.nextInt(); int guessD = input.nextInt();
            
            if (guessA >= 7 || guessA <= 0 ||guessB >= 7 || guessB <= 0 ||guessC >= 7 || guessC <= 0 ||guessD >= 7 || guessD <= 0)
            {
                System.out.println("Please only enter integers from 1 to 6");
                j--;
            }
            else if (guessA == trueConfig.getA() && guessB == trueConfig.getB() && guessC == trueConfig.getC() && guessD == trueConfig.getD()) 
            {
                System.out.println("Great job! You did it! You managed to guess the correct configuration in " + (j+1) + " tries!");
                testForFail++;
                break; 
            }
            else 
            {
                System.out.println("B: " + trueConfig.numberBlack(guessA, guessB, guessC, guessD) + "\nR: " + trueConfig.numberRed(guessA, guessB, guessC, guessD));
            }
        }
        
        if (testForFail == 0)
        {
            System.out.println("After twelve tries, you still failed. GJ. Oh yeah, the true configuration was\n" + trueConfig.actConfig());
        }
    }
    
    
}