
public class DateTest 
{
	public static void main(String[] args)
	{
		Date d = new Date(1, 1, 2014);
		System.out.println(d);
		
		for (int count = 1; count <= 365; count++)
		{
			d.nextDay();
			System.out.println(d);
		}
	}
}
