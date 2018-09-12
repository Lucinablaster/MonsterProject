package model;

public class MarshmallowMonster
{
	// -----------Declaration Section------//
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	private boolean hasEars;

	public MarshmallowMonster()
	{
		// Default constructor
		// Generally boring and not as helpful
	}

	public MarshmallowMonster(String name)
	{
		this.name = name;
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

	public String getName()
	{
		return name;
	}
	
	public double getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public void setHasEars(boolean hasEars)
	{
		this.hasEars = hasEars; 
	}
	
	public boolean getHasEars()
	{
		return hasEars;
	}
	
	
	
	
	public String toString()
	{
		String description = "This monster is named " + name + " and it has " + legCount + " legs," + " and " + eyeCount
				+ " eyes," + " and it's " + hasNoses + " that it has a nose," + " and " + armCount + " arms,"
				+ " and it's " + hasEars + " that is has ears.";

		return description;
	}

}