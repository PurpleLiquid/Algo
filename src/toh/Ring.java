package toh;

public class Ring
{
	private String ringName;
	private int ringSize;
	
	public Ring(String name, int size)
	{
		this.ringName = name;
		this.ringSize = size;
	}

	public String getRingName()
	{
		return ringName;
	}

	public void setRingName(String ringName)
	{
		this.ringName = ringName;
	}

	public int getRingSize()
	{
		return ringSize;
	}

	public void setRingSize(int ringSize)
	{
		this.ringSize = ringSize;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Ring otherRing = (Ring) obj;
		
		if (this.ringName.equals(otherRing.getRingName()) && this.ringSize == otherRing.getRingSize())
			return true;
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return this.ringName;
	}
}
