public class TestOverride
{
	public static void main(String[] args)
	{
		Base p = new Derived();
		p.DoStuff();
		p.DoStuff2();
		p.DoStuff3();
	}
}
