package Main;
import hostel.feeCollection;
import roomDetails.Room;
import java.util.*;
import HostelDetails.hostel;
import Storage.Inventory;
import StudentDetails.Student;

public class Test
{
	static int c1=0,c2=0;
	
 	public static void main(String[] args) throws ClassNotFoundException
	{
		int var1,var2;
		String ch="yes";
		feeCollection f[]= new feeCollection[10];
		Room r[]=new Room[10];
		Inventory i[]=new Inventory[10];
		Student s[]= new Student[10];
		hostel h[]=new hostel[10];
  		
		System.out.println("**********************************HOSTEL MANAGEMENT SYSTEM*************************************");
		while(ch.equalsIgnoreCase("yes"))
		{
			System.out.println("Select your choice");
			System.out.println("1 - Add details\n2 - Update Details\n3 - Display Details\n4 - Exit\n");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("1-Hostel Details\n2-Student Details");
				int choice2=sc.nextInt();
				System.out.println("\n");
				switch(choice2)
				{
					case 1:
					h[c1]=new hostel();
					i[c1]=new Inventory();
					System.out.println("Enter Hostel name: ");
					String name=sc.next();
					System.out.println("Enter Student count: ");
					long scount=sc.nextLong();
					System.out.println("Enter Room count: ");
					long rcount=sc.nextLong();
					h[c1].setHname(name);
					h[c1].setStudentcount(scount);
					h[c1].setRcount(rcount);
					System.out.println("Enter no. of beds: ");
					int beds=sc.nextInt();
					System.out.println("Enter no. of desks: ");
					int desk=sc.nextInt();
					System.out.println("Enter no. of sport goods: ");
					int sp=sc.nextInt();
					System.out.println("Enter no. of damaged goods: ");
					int dg=sc.nextInt();
					i[c1].setBeds(beds);
					i[c1].setDesks(desk);
					i[c1].setSportGoods(sp);
					i[c1].setDamagedGoods(dg);
					c1++;
					break;

					case 2:
					s[c2]=new Student();
					r[c2]=new Room();
					f[c2]=new feeCollection();
					System.out.println("Enter Student Name: ");
					String sname=sc.next();
					System.out.println("Enter Registered Number: ");
					String reg=sc.next();
					System.out.println("Enter Phone Number: ");
					long phno=sc.nextLong();
					s[c2].setSname(sname);
					s[c2].setRegNo(reg);
					s[c2].setPhno(phno);

					System.out.println("Enter Room Number: ");
					int rno=sc.nextInt();
					System.out.println("Enter Room Type(Single/multi): ");
					String rtype=sc.next();
					System.out.println("Enter Hostel Name: ");
					String hname2=sc.next();
					r[c2].setRoomNo(rno);
					r[c2].setRoomType(rtype);
					//sc.next();
					r[c2].setHostels(hname2);
					
					System.out.println("Enter Mess name(North/South/NRI): ");
					String mess=sc.next();
					r[c2].setMess(mess);
					if(r[c2].getRoomType().equalsIgnoreCase("Single"))
					{
						f[c2].setRoomfees(40000);
					}
					else
					{
						f[c2].setRoomfees(10000);
					}
					

					if(r[c2].getMess().equalsIgnoreCase("North"))
					{
						f[c2].setMessfees(4000);
					}
					else if(r[c2].getMess().equalsIgnoreCase("South"))
					{
						f[c2].setMessfees(3000);
					}
					else
					{
						f[c2].setMessfees(6000);
					}

					f[c2].computeFees();
					c2++;
					break;
				}
				break;
			
				
			case 2:
			System.out.println("1 - Hostel Details\n2 - Student Details:");
			int choice3=sc.nextInt();
			switch(choice3)
			{

				case 1:
				System.out.println("Enter the name of hostel: ");
				String hname=sc.next();
				for(var1=0;var1<=c1;var1++)
				{
					if(h[var1].getHname().equalsIgnoreCase(hname))
					{
						System.out.println("Enter your choice to update\n1 - Bed\n2 - Desk\n3 - Sports goods\n 4 - Damaged Goods\n5 - Student count:");
						int choice4=sc.nextInt();
						System.out.println("Enter :");
						switch(choice4)
						{
							case 1:
								int bed=sc.nextInt();
								i[var1].setBeds(bed);
								break;
							case 2:
								int desk=sc.nextInt();
								i[var1].setDesks(desk);
								break;
							case 3:
								int sg=sc.nextInt();
								i[var1].setSportGoods(sg);
								break;
							case 4:
								int dg=sc.nextInt();
								i[var1].setDamagedGoods(dg);
								break;
							case 5:
								int scount2=sc.nextInt();
								h[var1].setStudentcount(scount2);
								break;
						}break;
					}
				}break;

				case 2:
      					System.out.println("Enter the reg no of the student:");
					String reg=sc.next();
					for(var2=0;var2<=c2;var2++)
					{
							if(s[var2].getRegNo().equalsIgnoreCase(reg))
							{
								System.out.println("Enter your choice to update\n1 -Phone no.\n2 - Room no.\n3 -Mess name");
								int choice5=sc.nextInt();
								System.out.println("Enter :");
								switch(choice5)
							{
									case 1:
									long phno=sc.nextLong();
									s[var2].setPhno(phno);break;
									case 2:
									int  rno=sc.nextInt();
									r[var2].setRoomNo(rno);break;
									case 3:
									String mname=sc.next();
									r[var2].setMess(mname);
									if(r[var2].getMess().equalsIgnoreCase("North"))
									{	
										f[var2].setMessfees(4000);
									}
									else if(r[var2].getMess().equalsIgnoreCase("south"))
									{	
										f[var2].setMessfees(3000);
									}
									else
									{
										f[var2].setMessfees(6000);
									}
								f[var2].computeFees();
								break;
								}break;
						}
					}
				}break;

			case 3:
					System.out.println("Enter your choice to display\n1- Hostel details \n2- Student details");
					int choice6=sc.nextInt();
					switch(choice6)
					{
					  case 1:
						
						System.out.println("Enter the name of the hostel: ");
						String hname=sc.next();
						for(var1=0;var1<=c1;var1++)
						{
							if(h[var1].getHname().equalsIgnoreCase(hname))
							{
								System.out.println("Hostel name : "+h[var1].getHname()+"\n studentcount : "+h[var1].getStudentcount()+"\nRoom count : "+h[var1].getRcount()+"\nBed count : " +i[var1].getBeds()+"\nDesk count : "+i[var1].getDesks() +"\nSports Goods: "+i[var1].getSportGoods() +"\nDamaged Goods: "+i[var1].getDamagedGoods());
break;
							}
						}
						break;
					case 2: 

						System.out.println("Enter the registered number of student: ");
						String reg=sc.next();
						for(var2=0;var2<=c2;var2++)
						{
							if(s[var2].getRegNo().equalsIgnoreCase(reg))
							{
								System.out.println("Student name: "+s[var2].getSname()+"\n Phone Number: "+s[var2].getPhno()+"\nRoom No. : "+r[var2].getRoomNo()+"\nRoom Type : " +r[var2].getRoomType()+"\nHostel Name : "+h[var2].getHname() +"\nMess Name: "+r[var2].getMess() +"\nTotal Fees(Inclusive Of mess fees): "+f[var2].getFees());
								break;
							}
						}
						break;
					}
					break;
				}
				System.out.println("Do you wanna continue???(yes/no): ");
				ch=sc.next();
			}
		}
	}