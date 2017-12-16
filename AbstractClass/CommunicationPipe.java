public abstract class CommunicationPipe
{
	protected String m_Outgoing = "";
	protected String m_Incoming = "";

	public void StartWrite(String outgoing)
	{
		m_Outgoing += outgoing;
	}

	public String Read()
	{
		String incoming = m_Incoming;
		m_Incoming = "";
		
		return incoming;
	}

	public abstract void Process();
	public abstract void Close();
}
