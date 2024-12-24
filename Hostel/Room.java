package roomDetails;

public class Room
{
	private int roomNo;
	private String roomType;
	private String hostels;
	private String Mess;

	public String getMess()
	{
		return Mess;
	}
	
	public void setMess(String mess)
	{
		Mess=mess;
	}

	public int getRoomNo()
	{
		return roomNo;
	}

	public void setRoomNo(int roomNo)
	{
		this.roomNo=roomNo;
	}

	public String getRoomType()
	{
		return roomType;
	}

	public void setRoomType(String roomType)
	{
		this.roomType=roomType;
	}

	public String getHostels()
	{
		return hostels;
	}

	public void setHostels(String hostels)
	{
		this.hostels=hostels;
	}
}