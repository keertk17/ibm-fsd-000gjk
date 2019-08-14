package comm.example;

public class MyDate {
	public int x;
	public int y;
	public int z;
	public MyDate() {
		this(10);
		}
	public MyDate(int x) {
		this(x,20);
	}
	public MyDate(int x,int y) {
		this(x,y,30);
	}
	public MyDate(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public String getXYZ() {
		return "X="+x+ "Y="+y+ "Z="+z;
	}
	private int day;
	private int month;
	private int year;
	
	public void createDate(int d,int m,int y)
	{
		if(d>30) 
		{
			System.out.println("day cannot be greater than 30");
			System.exit(0); //thread is also stopped
		}
		if(m>12) 
		{
			System.out.println("month cannot be greater than 12");
			System.exit(0); //thread is also stopped
		}
	
		if(y>1990 && y>2019) 
		{
			System.out.println("wrong year");
			System.exit(0); //thread is also stopped
		}
		day=d;
		month=m;
		year=y;
	
	}

public String getDetails() 
{
	return day+"-"+month+"-"+year;
}
public int getDay()
{
	return day;
}
public int getMonth()
{
	return month;
}
public int getYear()
{
	return year;
}

public boolean setDay(int d) 
{
	if(d>30) 
	{
		//System.out.println("day cannot be greater than 30");
		return false;
	}
	else {
		//System.out.println("day set");
		return true;
	}
}
public boolean setMonth(int m) 
{
	if(m>12) 
	{
		//System.out.println("month cannot be greater than 12");
		return false;
	}
	else {
		//System.out.println("month set");
		return true;
	}
}
public boolean setYear(int y) 
{
	if(y>1990 && y>2019) 
	{
		//System.out.println("wrong year");
		return false;
	}
	else {
		//System.out.println("year set");
		return true;
	}
}



}
