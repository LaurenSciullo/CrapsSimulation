import java.util.Scanner;

public class CrapsSimulation
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Welcome to the Craps Simulation. Good luck! Enter your name to begin: ");
				String name = userInput.nextLine();
				
				
						
				int roll1 = (int)(Math.random()*6+1);
				int roll2 = (int)(Math.random()*6+1);
				
				int rollResult = roll1 + roll2;
				
				if (rollResult == 7 || rollResult == 11)
					{
						System.out.println("You rolled a " + roll1 + " and a  " + roll2 + " for a total of " + rollResult + ". You win, " + name);
						
					}
				else if (rollResult == 12 || rollResult == 2)
					{
						System.out.println("You rolled a " + roll1 + " and a " + roll2 + " for a total of " + rollResult + ". Sorry, but you lose, " + name);
						
					}
				
					else
					{
						System.out.println("You rolled a " + roll1 + " and a " + roll2 + ". Your point is " + rollResult + ", " +name);
						
					
				
				
				boolean rollAgain = true;
				while (rollAgain) 
					{
						
						
						
					int try1 = (int)(Math.random()*6+1);
					int try2 = (int)(Math.random()*6+1);
					int tryResult = try1 + try2;
						
					
					if (tryResult != rollResult && tryResult != 7)
						{
							System.out.println("Press enter to roll again");
							String fake = userInput.nextLine();
					System.out.println("\nYour point is " + rollResult + ", but you rolled a " + try1 + " and a " + try2 + " for a total of " + tryResult);
					
					rollAgain = false;
						}
					else if (tryResult == 7)
						{
							System.out.println("\n" + name + ", sorry, you rolled a " + try1 + " and a " + try2 + " for a total of 7. You lose!");
							rollAgain = false;			
						}
					else 
						{
							System.out.println("\n" + name + ", you win! You rolled a " + try1 + " and a " + try2);
							rollAgain = true;
					}
								
					}
					}
			}
	}
