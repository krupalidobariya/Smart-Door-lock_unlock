package HostelDetails;
public class hostel
{
	private long Studentcount;
	private String hname;
	private long rcount;
	
	public long getRcount()
	{
	 	return rcount;
	}
 	
	public void setRcount(long rcount)
	{
		this.rcount=rcount;
	}

	public String getHname()
	{
		return hname;
	}
	public void setHname(String hname)
	{
		this.hname=hname;
	}
		
	public long getStudentcount()
	{
		return Studentcount;
	}
	public void setStudentcount(long studentcount)
	{
		Studentcount=studentcount;
	}
}
