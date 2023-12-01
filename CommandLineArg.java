public class CommandLineArg
{
	public static void main(String... s)
	{
		try
		{
			int x=100/s.length;
			System.out.println(x);
			int z[]=new int[s.length];
			z[2]=1000;
			System.out.println("z[2] value is "+z[2]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}