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
		System.out.println("Derived DoStuff2 - calling super.DoStuff2");
		super.DoStuff2();
	}

	/*
	This has to be removed (Derived DoStuff3) to build successfully
	because the base class DoStuff3 is marked final.
	public void DoStuff3()
	{
		System.out.println("Derived DoStuff3");
	}
	*/
}
