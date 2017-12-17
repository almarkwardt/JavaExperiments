package almarkwardt.mathhelpers;

public final class Adder
{
	private Adder()
	{
		// Static class - prevent instantiation
		// with the private constructor.
	}

	public static int AddInts(int a, int b)
	{
		return (a + b);
	}

	public static double AddDoubles(double a, double b)
	{
		return (a + b);
	}
}
