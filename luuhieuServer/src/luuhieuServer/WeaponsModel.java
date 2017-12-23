package luuhieuServer;

public class WeaponsModel  {

	private String name;
	private int type;
	private int dame;
	private int level;
	private int upgrade;
	private int attribute;
	private int id;
	private int[] slot;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getType()
	{
		return type;
	}
	public void setType(int type)
	{
		this.type = type;
	}
	public int getDame()
	{
		return dame;
	}
	public void setdame(int dame)
	{
		this.dame = dame;
	}
	public int getLevel()
	{
		return level;
	}
	public void setLevel(int level)
	{
		this.level = level;
	}
	public int getUpgrade()
	{
		return upgrade;
	}
	public void setUpgrade(int upgrade)
	{
		this.upgrade = upgrade;
	}
	public int getAttribute()
	{
		return attribute;
	}
	public void setAttribute(int attribute)
	{
		this.attribute = attribute;
	}
	public void setID(int id)
	{
		this.id =  id;
	}
	public int getID()
	{
		return id;
	}
	public void setSlot(int[] slot)
	{
		this.slot =  slot;
	}
	public int[] getSlot()
	{
		return slot;
	}
}
