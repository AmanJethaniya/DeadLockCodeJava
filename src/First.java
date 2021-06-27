
public class First 
{
	public synchronized void d1(Second second)
	{
		System.out.println("Thread 1 executing d1");
	
	try {
	Thread.sleep(1000);
	}catch( InterruptedException e) {}
	System.out.println("Calling last method inside First class");
	second.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside First's last method");
	}

}
