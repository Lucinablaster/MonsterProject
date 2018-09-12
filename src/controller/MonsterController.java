package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	// Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members@
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Harold", 2.0, 3, true, 4, true);
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("We will be setting the params for a monster, what will you name it?");
		String name = inputScanner.next();
		userMonster.setName(name);
		
		System.out.println("How many legs would you like your monster to have?");
		double legCount = inputScanner.nextInt();
		userMonster.setLegCount(legCount);
				
		System.out.println("How many eyes does your monster have?");
		int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		

		System.out.println("Does your monster have a nose?");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(hasNoses);
		
		System.out.println("How many arms would you like for your monster?");
		int arms = inputScanner.nextInt();
		userMonster.setArmCount(arms);
		
		System.out.println("Does your monster have ears?");
		boolean hasEars = inputScanner.nextBoolean();
		userMonster.setHasEars(hasEars);
		
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms!");
		
		
		
		//System.out.println("We will be making a monster, what would you like to name it?");
		//Scanner inputScanner = new Scanner(System.in);
		System.out.println(userMonster);
		inputScanner.close();
	}

}
