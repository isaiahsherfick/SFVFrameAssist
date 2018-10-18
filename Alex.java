import java.awt.*;
import java.util.*;

//Last updated 15 Oct 2018

public class Alex extends Character
{
	public Alex()
	{
		super("Alex", new ArrayList<Move>(), 1025);
		this.addMove(new Move("st.LP",4,3,7,4,2));
		this.addMove(new Move("st.MP",6,2,12,5,2));
		//LMFAO Alex's standing heavy punch is negative on hit
		this.addMove(new Move("st.HP",10,3,22,-1,-3));
		this.addMove(new Move("st.LK",5,3,8,2,-1));
		this.addMove(new Move("st.MK",8,3,15,2,-2));
		this.addMove(new Move("st.HK",17,3,24,1,-4));
	}
}
