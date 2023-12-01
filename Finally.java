public class Finally
{
	static int show()
	{
		try
		{
			System.exit(0);
			int x=10/0;
			return 20;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			return 40;
		}
		
	}
	public static void main(String... args)
	{
		int z=show();
		System.out.println(z); 
		
	}
}