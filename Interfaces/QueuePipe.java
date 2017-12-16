public class QueuePipe implements CommunicationPipe
{
	private String m_OutgoingQueue = "";
	private String m_IncomingQueue = "";

	public QueuePipe()
	{
		m_OutgoingQueue = "";
		m_IncomingQueue = "";
	}

	public void Write(String toWrite)
	{
		m_OutgoingQueue += toWrite;
	}

	public String Read()
	{
		String readString = m_IncomingQueue;
		m_IncomingQueue = "";

		return readString;
	}

	public void Close()
	{
		Cleanup();
	}

	private void Cleanup()
	{
		m_OutgoingQueue = "";
		m_IncomingQueue = "";
	}

	public String ReadOutgoing()
	{
		String outgoing = m_OutgoingQueue;
		m_OutgoingQueue = "";

		return outgoing;
	}

	public void WriteIncoming(String toWrite)
	{
		m_IncomingQueue += toWrite;
	}
}
