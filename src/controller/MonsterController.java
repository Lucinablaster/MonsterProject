package controller;

import model.MarshmallowMonster;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MonsterController
{
	// Data member section
	// Declaration section
	//private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;

	// Constructors initialize data members@
	public MonsterController()
	{
		//myMonster = new MarshmallowMonster("Harold", 2.0, 3, true, 4, true);
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}

	public void start()
	{
		// JOptionPane.showMessageDialog(null, myMonster);
		// System.out.println(myMonster);

		// System.out.println("What would you like to name your monster?");
		String userInput = JOptionPane.showInputDialog(null, "What do you want to name your monster");
		String name = userInput;
		userMonster.setName(name);

		userInput = JOptionPane.showInputDialog(null, "How many eyes would you like on the creature?");
		int eyes = 0;
		if (validInt(userInput))
		{
			eyes = Integer.parseInt(userInput);
			userMonster.setEyeCount(eyes);
		}
		else
		{

			JOptionPane.showMessageDialog(null, "Error. Please input a valid whole number.");
		}

		userInput = JOptionPane.showInputDialog(null, "How many arms would you like on the creature");
		int arms = 0;
		if (validInt(userInput))
		{
			arms = Integer.parseInt(userInput);
			userMonster.setArmCount(arms);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error. Please enter a valid whole number.");
		}

		userInput = JOptionPane.showInputDialog(null, "Does your monster have a nose?");
		boolean hasNose = false;
		hasNose = Boolean.parseBoolean(userInput);
		userMonster.setHasNoses(hasNose);

		userInput = JOptionPane.showInputDialog(null, "How many legs would you like your monster to have?");
		double legs = 0;
		if (validDouble(userInput))
		{
			legs = Double.parseDouble(userInput);
			userMonster.setLegCount(legs);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Error. Please enter a valid decimal integer, or a number with a . in the middle");
		}

		userInput = JOptionPane.showInputDialog(null, "Does  your monster have ears?");
		boolean ears = false;
		ears = Boolean.parseBoolean(userInput);
		userMonster.setHasEars(ears);
		
		// JOptionPane.showMessageDialog(null, myMonster);
		//System.out.println("How many legs would you like your monster to have?");
		//double legCount = inputScanner.nextInt();
		//userMonster.setLegCount(legCount);

		// System.out.println("How many eyes does your monster have?");
		// int eyeCount = inputScanner.nextInt();
		// userMonster.setEyeCount(eyeCount);

		// System.out.println("Does your monster have a nose?");
		// boolean hasNoses = inputScanner.nextBoolean();
		// userMonster.setHasNoses(hasNoses);

		// System.out.println("How many arms would you like for your monster?");
		// int armCount = inputScanner.nextInt();
		// userMonster.setArmCount(armCount);

		//System.out.println("Does your monster have ears?");
		//boolean hasEars = inputScanner.nextBoolean();
		//userMonster.setHasEars(hasEars);

		// System.out.println("Your monster has " + userMonster.getArmCount() + "
		// arms!");

		// System.out.println("We will be making a monster, what would you like to name
		// it?");
		// Scanner inputScanner = new Scanner(System.in);
		System.out.println(userMonster);
		inputScanner.close();
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}

	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle");
		}
		return isValid;
	}

}
