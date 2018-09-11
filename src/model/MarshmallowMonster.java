package model;

public class MarshmallowMonster
{
	//-----------Declaration Section------//
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	private boolean hasEars;
	
	public MarshmallowMonster()
	{
	//Default constructor
	//Generally boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name ; 
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms, boolean ears)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
		this.hasEars = ears;
	}
	
	public String toString()
	{
		String description = "This monster is named " + name
				+ " and it has " + legCount +" legs,"
				+ " and " + eyeCount +" eyes,"
				+ " and it's " + hasNoses +" that it has a nose,"
				+ " and " + armCount +" arms,"
				+ " and it's " + hasEars +" that is has ears."; 
		
		return description; 
	}
	
}