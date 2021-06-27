
public class DeadlockTest extends Thread
{
	First first=new First();
	Second second= new Second();
	
	void m1()
	{
		this.start();
		first.d1(second);
	}
	public void run()
	{
		second.d2(first);
	}
	public static void main(String[] args) 
	{
		DeadlockTest test=new DeadlockTest();
		test.m1();
	}

}
