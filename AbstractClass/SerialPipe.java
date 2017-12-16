public class SerialPipe extends CommunicationPipe
{
	public SerialPipe()
	{
		// TODO: Open the serial port
	}

	public void Process()
	{
		String outgoing = m_Outgoing;
		m_Outgoing = "";
		// TODO: Write outgoing to the serial port

		String incoming = "";
		// TODO: Read from serial port and add to incoming
		m_Incoming += incoming;
	}

	public void Close()
	{
		// TODO: Clean up the serial port
	}
}
