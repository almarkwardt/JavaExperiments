public class Derived extends Base
{
	public Derived()
	{
		System.out.println("Derived constructor");
	}

	public void DoStuff()
	{
		System.out.println("Derived DoStuff");
	}

	public void DoStuff2()
	{
		super.DoStuff2();
	}
}
