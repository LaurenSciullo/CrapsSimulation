import java.util.Scanner;

public class CrapsSimulation
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Welcome to the Craps Simulation. Good luck! Enter your name to begin: ");
				String name = userInput.nextLine();
				
				boolean result = true;
				while (result) 
					{
						
				int roll1 = (int)(Math.random()*6+1);
				int roll2 = (int)(Math.random()*6+1);
				
				int rollResult = roll1 + roll2;
				
				if (rollResult ==7 )
					{
						System.out.println("You rolled a " + roll1 + " and a  " + roll2 + " for a total of 7. You win, " + name);
						result = false;
					}
				else if (rollResult == 12)
					{
						System.out.println("You rolled a " + roll1 + " and a " + roll2 + " for a total of 12. Sorry, but you lose, " + name);
						result = false;
					}
				else 
					{
						System.out.println("You rolled a " + roll1 + " and a " + roll2 + ". Your point is " + rollResult + ", " +name);
					}
					
			}
			}
	}
