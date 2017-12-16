public class TestPipe
{
	public static void main(String[] args)
	{
		CommunicationPipe pipe = new SerialPipe();

		for(int k = 0; k < 10; ++k)
		{
			pipe.StartWrite("asdf");
			String incoming = pipe.Read();
			pipe.Process();
		}

		pipe.Close();
	}
}
