import java.awt.*;
import java.util.*;

public class Move
{
	private String name;
	private int startup;
	private int active;
	private int recovery;
	private int onBlock;
	private int onHit;

	public Move(String name, int startup, int active, int recovery, int onHit, int onBlock)
	{
		this.name = name;
		this.startup = startup;
		this.active = active;
		this.recovery = recovery;
		this.onBlock = onBlock;
		this.onHit = onHit;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getStartup()
	{
		return this.startup;
	}

	public void setStartup(int startup)
	{
		this.startup = startup;
	}

	public int getActive()
	{
		return this.active;
	}

	public void setActive(int active)
	{
		this.active = active;
	}

	public int getRecovery()
	{
		return this.recovery;
	}

	public void setRecovery(int recovery)
	{
		this.recovery = recovery;
	}

	public int getOnHit()
	{
		return this.onHit;
	}

	public void setOnHit(int onHit)
	{
		this.onHit = onHit;
	}

	public int getOnBlock()
	{	
		return this.onBlock;
	}

	public void setOnBlock(int onBlock)
	{
		this.onBlock = onBlock;
	}
}
