import java.awt.*;
import java.util.*;

public class Character
{
	private ArrayList<Move> moves;
	private String name;
	private int health;

	public Character(String name, ArrayList<Move> moves, int health)
	{
		this.name = name;
		this.moves = moves;
		this.health = health;
	}

	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void addMove(Move newMove)
	{
		this.moves.add(newMove);
	}

	public Move getMove(int index)
	{
		return this.moves.get(index);
	}

	public int getHealth()
	{
		return this.health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public int getNumberOfMoves()
	{
		return this.moves.size();
	}
}
