package Storage;

public class Inventory
{
	private int damagedGoods;
	private int desks;
	
	public int getDamagedGoods()
	{
		return damagedGoods;
	}

	public void setDamagedGoods(int damagedGoods)
	{
		this.damagedGoods=damagedGoods;
	}

	private int beds;
	private int sportgoods;

	public int getDesks()
	{
		return desks;
	}

	public void setDesks(int desks)
	{
		this.desks=desks;
	}

	
	public int getBeds()
	{
		return beds;
	}

	public void setBeds(int beds)
	{
		this.beds=beds;
	}

	
	public int getSportGoods()
	{
		return sportgoods;
	}

	public void setSportGoods(int sportgoods)
	{
		this.sportgoods=sportgoods;
	}
}