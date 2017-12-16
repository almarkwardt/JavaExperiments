public interface CommunicationPipe
{
	public void Write(String toWrite);
	public String Read();
	public void Close();
}
