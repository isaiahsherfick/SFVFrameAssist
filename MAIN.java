import java.util.*;
import java.awt.*;

public class MAIN
{
	public static void main(String[] args)
	{
		Akuma akuma = new Akuma();
		System.out.printf("\t\t------------Akuma------------\n");
		for (int i = 0; i < akuma.getNumberOfMoves(); i++)
		{
			System.out.printf("%s\tstartup: %d\tactive: %d\trecovery: %d\ton hit: +%d\ton block: %d\n",akuma.getMove(i).getName(),akuma.getMove(i).getActive(),
				akuma.getMove(i).getRecovery(),akuma.getMove(i).getOnHit(),akuma.getMove(i).getOnBlock());
		}
	}
}
