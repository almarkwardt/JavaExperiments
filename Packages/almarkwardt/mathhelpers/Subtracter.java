package almarkwardt.mathhelpers;

public final class Subtracter
{
	private Subtracter()
	{
		// Static class - prevent instantiation
		// with the private constructor.
	}

	public static int SubtractInts(int a, int b)
	{
		return (a - b);
	}

	public static double SubtractDoubles(double a, double b)
	{
		return (a - b);
	}
}
