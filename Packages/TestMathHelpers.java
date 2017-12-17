import almarkwardt.mathhelpers.Adder;
import almarkwardt.mathhelpers.Subtracter;

public class TestMathHelpers
{
	public static void main(String[] args)
	{
		final int a = 5;
		final int b = 2;

		System.out.format("%d + %d = %d\n", a, b,
		                  Adder.AddInts(a, b));

		System.out.format("%d - %d = %d\n", a, b,
		                  Subtracter.SubtractInts(a, b));

		final double c = 5.3;
		final double d = 2.1;

		System.out.format("%f + %f = %f\n", c, d,
		                  Adder.AddDoubles(c, d));

		System.out.format("%f - %f = %f\n", c, d,
		                  Subtracter.SubtractDoubles(c, d));
	}
}
