public class MyAuto
{
	public static void main(String... args)
	{
		try(Demo d=new Demo(); Demo1 d1=new Demo1())
		{
			//System.exit(0)
			int x=10/0;
			d.show();
			d1.show1();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
class Demo implements AutoCloseable
{
	public void show()
	{
		System.out.println("Show");
	}
	public void close()    //Always close method executed 
	{
		System.out.println("Close from show and Demo");
	}
}
class Demo1 implements AutoCloseable
{
	public void show1()
	{
		System.out.println("show1");
	}
	public void close()    //Always close method executed
	{
		System.out.println("Close from show1");
	}
}
