public class TestPipe
{
	public static void main(String[] args)
	{
		QueuePipe thePipe = new QueuePipe();
		CommunicationPipe theGenericPipe = thePipe;

		thePipe.WriteIncoming("asdf");
		theGenericPipe.Write("qwer");

		String incoming = theGenericPipe.Read();
		String outgoing = thePipe.ReadOutgoing();

		System.out.println("Outgoing = " + outgoing);
		System.out.println("Incoming = " + incoming);

		if(outgoing.equals("qwer")
		   && incoming.equals("asdf"))
		{
			System.out.println("Worked as expected.");
		}
		else
		{
			System.out.println("Something did not work.");
		}

		theGenericPipe.Close();
	}
}
