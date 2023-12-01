public class ParallelException{
	public static void main(String... args){
		try
		{
			int x=10/2; int z[]=new int[x];
			System.out.println(x);
			//int z[]=new int[x];
			z[5]=100;
			System.out.println(z[4]);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"jaja");
		}
		
	}
}