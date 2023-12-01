public class CommandLineArgument
{
	public static void main(String[] args)
	{
		try
		{
			int x=10/args.length;
			System.out.println(x);
			int z[]=new int[args.length];
			for (int i=0; i<args.length;i++){
				//char c=args.charAt(i);
				System.out.println("The value of z["+i+"]"+" is "+args[i]);
			}
			z[2]=100;
			System.out.println("After overiride z[2] value is "+z[2]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		
	}
}