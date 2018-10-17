import java.awt.*;
import java.util.*;

//Last updated 15 Oct 2018

public class Akuma extends Character
{
	public Akuma()
	{
		super("Akuma", new ArrayList<Move>(), 900);

		//Move data copied from FAT on 15 Oct 2018.
		this.addMove(new Move("s.LP",3,2,7,4,2));
		this.addMove(new Move("s.MP", 7,3,14,3,1));
		this.addMove(new Move("s.HP", 8,3,10,2,-5));
		this.addMove(new Move("s.LK",4,3,10,3,1));
		this.addMove(new Move("s.MK",5,2,18,4,-4));
		this.addMove(new Move("s.HK",12,2,22,3,-4));
		this.addMove(new Move("c.LP",4,2,6,4,2));
		this.addMove(new Move("c.MP",6,3,12,5,3));
		this.addMove(new Move("c.HP",10,4,16,8,3));
		this.addMove(new Move("c.LK",4,2,7,2,1));
		this.addMove(new Move("c.MK",6,2,14,3,-1));

		//+200 on hit is going to stand in place for causing a knockdown
		this.addMove(new Move("c.HK",7,2,24,200,-15));
		this.addMove(new Move("j.LP",3,6,0,0,0));
		this.addMove(new Move("j.MP",7,5,0,0,0));
		this.addMove(new Move("j.HP",8,5,0,0,0));
		this.addMove(new Move("j.LK",4,6,0,0,0));
		this.addMove(new Move("j.MK",7,4,0,0,0));
		this.addMove(new Move("j.HK",8,4,0,0,0));
		this.addMove(new Move("dropkick",16,16,0,0,0));
		this.addMove(new Move("overhead",23,2,21,0,-6));
		this.addMove(new Move("jumpy slam",32,7,16,5,-2));
		this.addMove(new Move("back HP",6,7,21,200,-10));
		this.addMove(new Move("HK target combo second hit",15,2,18,7,0));
		this.addMove(new Move("HP target combo second hit",18,8,30,200,-12));
		this.addMove(new Move("Grab",5,3,17,200,200));
		this.addMove(new Move("V-Skill",3,12,29,0,0));
		this.addMove(new Move("V-Skill Punch", 5,4,26,200,-10));
		this.addMove(new Move("V-Skill Kick", 10,4,26,200,-13));
		this.addMove(new Move("V Reversal",17,2,24,200,-2));
		this.addMove(new Move("Taunt",66,1,0,200,22));
		this.addMove(new Move("Idle Animation",402,2,0,23,0));
		this.addMove(new Move("LP Fireball", 14,45,34,200,-6));
		this.addMove(new Move("MP Fireball",14,35,34,200,-6));
		this.addMove(new Move("HP Fireball", 14,23,34,200,-6));
		this.addMove(new Move("EX Fireball", 11, 100, 35, 200, 1));
		this.addMove(new Move("LP Red Fireball",21,100,34,200,-6));
		this.addMove(new Move("MP Red Fireball",23,100,28,200,-7));
		this.addMove(new Move("HP Red Fireball",25,100,42,200,-8));
		this.addMove(new Move("EX Red Fireball",21,100,48,200,8));
		this.addMove(new Move("LP Air Fireball",11,100,9,200,0));
		this.addMove(new Move("MP Air Fireball",11,100,9,200,0));
		this.addMove(new Move("HP Air Fireball",11,100,9,200,0));
		this.addMove(new Move("EX Air Fireball",38,100,4,200,0));
		this.addMove(new Move("LP Goshoryuken",3,12,34,200,-18));
		this.addMove(new Move("MP Goshoryuken",4,11,41,200,-17));
		this.addMove(new Move("HP Goshoryuken",4,11,44,200,-17));
		this.addMove(new Move("EX Goshoryuken",3,32,47,200,-44));
		this.addMove(new Move("LK Tatsu",11,2,24,200,-11));
		this.addMove(new Move("MK Tatsu",4,6,23,200,-8));
		this.addMove(new Move("HK Tatsu",4,9,30,200,-39));
		this.addMove(new Move("EX Tatsu",10,11,26,200,-19));
		this.addMove(new Move("LK Demon Flip (slide)",47,8,14,200,-2));
		this.addMove(new Move("MK Demon Flip (slide)",48,8,14,200,-2));
		this.addMove(new Move("HK Demon Flip (slide)",49,8,14,200,-2));
		this.addMove(new Move("EX Demon Flip (slide)",44,18,12,200,2));
		this.addMove(new Move("LK Demon Flip (punch)",30,4,16,200,1));
	}	
}
