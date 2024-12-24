package hostel;

public class feeCollection
{
	private double fees;
	private double messfees;
	private double roomfees;
	private String regNo;

	public double getMessfees()
	{
		return messfees;
	}

	public void setMessfees(double messfees)
	{
		this.messfees=messfees;
	}

	
	public double getRoomfees()
	{
		return roomfees;
	}

	public void setRoomfees(double roomfees)
	{
		this.roomfees=roomfees;
	}

	public String getRegNo()
	{
		return regNo;
	}

	public void setRegNo(String regNo)
	{
		this.regNo=regNo;
	}

	public double getFees()
	{
		return fees;
	}

	public void computeFees()
	{
		fees=messfees+roomfees;
	}
}

	