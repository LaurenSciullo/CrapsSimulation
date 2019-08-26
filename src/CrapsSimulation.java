import java.util.Scanner;

public class CrapsSimulation
	{
		static String name;
		static String fake;
		static int rollResult;
		static int tryResult;
		static int roll1;
		static int roll2;
		static int try1;
		static int try2;
		static boolean rollAgain;
		
		
		public static void main(String[] args)
			{
				greetUser();
				generateFirstRoll();
				outputFirstRoll();
				enterSecondRoll();
				outputSecondRoll();
				
			}
		

		public static void greetUser()  
		{
				System.out.println("Welcome to the Craps Simulation. Good luck! Enter your name to begin: ");
				
		}
		
		public static int generateFirstRoll() 
		{
				 roll1 = (int)(Math.random()*6+1);
				 roll2 = (int)(Math.random()*6+1);
				 rollResult = roll1 + roll2;
				return rollResult;
		}
				
				
		public static void outputFirstRoll() 
		{
				Scanner userInput = new Scanner(System.in);
				 name = userInput.nextLine();
				 
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
						System.out.println("You rolled a " + roll1 + " and a " + roll2 + ". Your point is " + rollResult + ", " + name);
						
					}
		}
				
			public static int  enterSecondRoll() 
			{
				
					 try1 = (int)(Math.random()*6+1);
					 try2 = (int)(Math.random()*6+1);
					 tryResult = try1 + try2;
					return tryResult;
					
					}
				
			public static void outputSecondRoll()
				{
					
				 rollAgain = true;
				while (rollAgain) 
					{ 
						enterSecondRoll();
						System.out.println("Press enter to roll again");
						Scanner userInput = new Scanner(System.in);
						 fake = userInput.nextLine();
						
					if (tryResult != rollResult && tryResult != 7)
						{
						
					System.out.println("\nYour point is " + rollResult + ", but you rolled a " + try1 + " and a " + try2 + " for a total of " + tryResult);	
				
						}
					else if (tryResult == 7)
						{
							System.out.println("\n" + name + ", sorry, you rolled a " + try1 + " and a " + try2 + " for a total of 7. You lose!");
							rollAgain = false;			
						}
					else 
						{
							System.out.println("\n" + name + ", you win! You rolled a " + try1 + " and a " + try2 + " and so your total of " + tryResult + " matched your point of " + rollResult);
							rollAgain = false;
					}
								
					}
				}
					
			
	}
