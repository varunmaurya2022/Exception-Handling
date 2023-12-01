public class NestedTryEx
{
	public static void main(String... args)
	{
		try
		{
			int num[]={1,2,3};
			System.out.println("Enter Outer try block!");
			try
			{
				System.out.println("Enter in inner try block!");
				int result=num[10];
				System.out.println("Inner Block ends "+num[1]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("Outer Block ends!");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}