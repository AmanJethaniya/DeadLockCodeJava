
public class Second 
{
	public synchronized void d2(First first)
	{
		System.out.println("Thread 2executing d2");
	
	try {
	Thread.sleep(1000);
	}catch( InterruptedException e) {}
	System.out.println("Calling last method inside second class");
	first.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside second's last method");
	}


}
