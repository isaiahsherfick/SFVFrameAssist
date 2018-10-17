import java.util.*;
import java.awt.*;

public class MAIN
{
	public static void main(String[] args)
	{
		//Initialize scanner
		Scanner scanner = new Scanner(System.in);

		//will contain user input
		int userInt;

		//will contain user input
		String userString;

		//Initialize character data
		Akuma akuma = new Akuma();

		//infinite loop
		while (true)
		{
			//Prompt user for input
			System.out.printf("Please input what you would like to do\n");
			System.out.printf("1. Print a character's frame data\n");
			System.out.printf("2. Other options go here\n");
			System.out.printf("3. Exit\n");

			//Fetch user input, store in userInt
			userInt = scanner.nextInt();

			switch(userInt)
			{
				case 1:
					//prompt user for input
					System.out.printf("\nPlease input the name of the character whose frame data you would like displayed: ");
					
					//fetch user input, store in userString
					userString = scanner.next();

					switch(userString.toLowerCase())
					{
						case "akuma":
							displayFrameData(akuma);
							break;
						default:
							System.out.printf("Sorry, %s's data has not been added to this program yet.\n",userString);
							break;
					}
					break;
				case 3:
					System.exit(0);
				default:
					System.out.printf("Erronious input, try again\n");
					break;
			}
		}

	}

	public static void displayFrameData(Character character)
	{
		System.out.printf("\t\t------------%s------------\n",character.getName());
		for (int i = 0; i < character.getNumberOfMoves(); i++)
		{
			if (character.getMove(i).getOnHit() != 200)
			{
				System.out.printf("%s\nstartup: %d\tactive: %d\trecovery: %d\ton hit: KD\ton block: %d\n\n",character.getMove(i).getName(),character.getMove(i).getStartup(),
				character.getMove(i).getActive(),character.getMove(i).getRecovery(),character.getMove(i).getOnBlock());
			}
			else
			{
				System.out.printf("%s\nstartup: %d\tactive: %d\trecovery: %d\ton hit: %d\ton block: %d\n\n",character.getMove(i).getName(),character.getMove(i).getStartup(),
				character.getMove(i).getActive(),character.getMove(i).getRecovery(),character.getMove(i).getOnHit(),character.getMove(i).getOnBlock());
			}
		}
	}
}
